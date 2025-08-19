package CodeGen;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AngularToVanilla {
    private final Path outputDir = Paths.get("dist");

    public void generateFromTemplates(Path appComponentHtml, Path productListHtml, Path productDetailsTs) throws IOException {
        if (!Files.exists(outputDir)) Files.createDirectories(outputDir);

        String appTpl = Files.readString(appComponentHtml, StandardCharsets.UTF_8);
        String listTpl = Files.readString(productListHtml, StandardCharsets.UTF_8);
        String detailsTpl;
        String rawDetails = Files.readString(productDetailsTs, StandardCharsets.UTF_8);
        if (productDetailsTs.toString().endsWith(".ts")) {
            detailsTpl = extractInlineTemplate(rawDetails);
        } else {
            detailsTpl = rawDetails;
        }

        String listRenderFn = buildListRenderer(listTpl);
        String detailsRenderFn = buildDetailsRenderer(detailsTpl);

        write("index.html", buildIndexHtml());
        write("styles.css", defaultStyles());
        write("app.js", buildAppJs(listRenderFn, detailsRenderFn));
    }

    private String extractInlineTemplate(String ts) {
        // naive extraction of template: ` ... ` inside @Component({ template: `...` })
        Pattern p = Pattern.compile("template\s*:\s*`([\\s\\S]*?)`", Pattern.MULTILINE);
        Matcher m = p.matcher(ts);
        if (m.find()) {
            return m.group(1);
        }
        return "<div *ngIf=\"product\"><h2>{{ product.name }}</h2><img [src]=\"product.image\" alt=\"{{ product.name }}\"><p>{{ product.details }}</p></div>" +
               "<div *ngIf=\"!product\"><p>Please select a product.</p></div>";
    }

    private String buildListRenderer(String tpl) {
        // Recognize *ngFor and common bindings within one root container
        // Example from product-list.html
        // <div *ngFor="let product of products" (click)="selectProduct(product)">
        //   <h3>{{ product.name }}</h3>
        //   <img [src]="product.image" alt="{{ product.name }}">
        // </div>
        String loopVar = "item";
        String collection = "items";
        Matcher forM = Pattern.compile("\\*ngFor=\"\\s*let\\s+(\\w+)\\s+of\\s+(\\w+)\\s*\"", Pattern.CASE_INSENSITIVE).matcher(tpl);
        if (forM.find()) {
            loopVar = forM.group(1);
            collection = forM.group(2);
        }
        boolean hasClick = tpl.contains("(click)");

        // Interpolations
        boolean hasTitle = tpl.contains("{{ "+loopVar+".name }}");
        boolean hasImg = tpl.contains("[src]=\""+loopVar+".image\"") || tpl.contains("[src]=\""+loopVar+".image\"");
        boolean hasAlt = tpl.contains("alt=\"{{ "+loopVar+".name }}\"");

        StringBuilder fn = new StringBuilder();
        fn.append("function renderProductList(host, scope){\n");
        fn.append("  host.innerHTML='';\n");
        fn.append("  (scope."+collection+"||[]).forEach(function("+loopVar+"){\n");
        fn.append("    var card=document.createElement('div'); card.className='product';\n");
        if (hasImg) {
            fn.append("    var img=document.createElement('img'); img.src=("+loopVar+".image)||'https://via.placeholder.com/400x300?text=No+Image'; img.alt=(''+("+loopVar+".name||'')); card.appendChild(img);\n");
        }
        fn.append("    var content=document.createElement('div'); content.className='content';\n");
        if (hasTitle) {
            fn.append("    var h3=document.createElement('h3'); h3.textContent=(''+("+loopVar+".name||'')); content.appendChild(h3);\n");
        }
        if (hasClick) {
            // emit CustomEvent 'selectedProduct'
            fn.append("    card.addEventListener('click', function(){ host.dispatchEvent(new CustomEvent('selectedProduct',{detail:"+loopVar+"})); });\n");
        }
        fn.append("    card.appendChild(content);\n");
        fn.append("    host.appendChild(card);\n");
        fn.append("  });\n");
        fn.append("}\n");
        return fn.toString();
    }

    private String buildDetailsRenderer(String tpl) {
        // Support two blocks toggled by *ngIf
        // Use simple presence of *ngIf="product" and *ngIf="!product"
        boolean hasIfProduct = tpl.contains("*ngIf=\"product\"");
        boolean hasIfNotProduct = tpl.contains("*ngIf=\"!product\"");
        boolean hasName = tpl.contains("{{ product.name }}");
        boolean hasImg = tpl.contains("[src]=\"product.image\"") || tpl.contains("[src]=\" product.image \"");
        boolean hasDetails = tpl.contains("{{ product.details }}");

        StringBuilder fn = new StringBuilder();
        fn.append("function renderProductDetails(host, scope){\n");
        fn.append("  host.innerHTML='';\n");
        if (hasIfProduct) {
            fn.append("  if(scope.product){\n");
        }
        if (hasImg) {
            fn.append("    var img=document.createElement('img'); img.src=(scope.product && scope.product.image)||'https://via.placeholder.com/800x500?text=No+Image'; img.alt=(''+(scope.product?scope.product.name:'')); img.style.width='100%'; img.style.maxHeight='360px'; img.style.objectFit='cover'; host.appendChild(img);\n");
        }
        if (hasName) {
            fn.append("    var h2=document.createElement('h2'); h2.textContent=(''+(scope.product?scope.product.name:'')); host.appendChild(h2);\n");
        }
        if (hasDetails) {
            fn.append("    var p=document.createElement('p'); p.textContent=(''+(scope.product?scope.product.details:'')); host.appendChild(p);\n");
        }
        if (hasIfProduct) {
            fn.append("  } else {\n");
            if (hasIfNotProduct) {
                fn.append("    var msg=document.createElement('p'); msg.textContent='Please select a product.'; host.appendChild(msg);\n");
            }
            fn.append("  }\n");
        }
        fn.append("}\n");
        return fn.toString();
    }

    private String buildIndexHtml() {
        return "<!doctype html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <meta charset=\"utf-8\"/>\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\n" +
                "  <title>Products App</title>\n" +
                "  <link rel=\"stylesheet\" href=\"styles.css\"/>\n" +
                "</head>\n" +
                "<body>\n" +
                "  <header class=\"container\">\n" +
                "    <h1>Products App</h1>\n" +
                "    <nav>\n" +
                "      <button class=\"btn\" data-nav=\"list\">Products</button>\n" +
                "      <button class=\"btn\" data-nav=\"add\">Add Product</button>\n" +
                "    </nav>\n" +
                "  </header>\n" +
                "  <main class=\"container\">\n" +
                "    <section id=\"view-list\">\n" +
                "      <div id=\"listHost\"></div>\n" +
                "    </section>\n" +
                "    <section id=\"view-add\" style=\"display:none\">\n" +
                "      <form id=\"productForm\" class=\"card\">\n" +
                "        <label>Name<input id=\"name\" type=\"text\" required></label>\n" +
                "        <label>Image URL<input id=\"image\" type=\"url\"></label>\n" +
                "        <label>Details<textarea id=\"details\"></textarea></label>\n" +
                "        <div class=\"actions\"><button class=\"btn primary\" type=\"submit\">Save</button><button class=\"btn\" type=\"button\" data-nav=\"list\">Cancel</button></div>\n" +
                "      </form>\n" +
                "    </section>\n" +
                "    <section id=\"view-details\" style=\"display:none\">\n" +
                "      <div id=\"detailsHost\" class=\"card\"></div>\n" +
                "      <div class=\"actions\"><button class=\"btn\" data-nav=\"list\">Back to list</button></div>\n" +
                "    </section>\n" +
                "  </main>\n" +
                "  <script src=\"app.js\"></script>\n" +
                "</body>\n" +
                "</html>\n";
    }

    private String defaultStyles() {
        return "*{box-sizing:border-box}body{margin:0;font-family:system-ui,-apple-system,Segoe UI,Roboto,Helvetica,Arial,sans-serif;background:#f6f7f9;color:#222}"+
               ".container{max-width:960px;margin:0 auto;padding:16px}"+
               "header{background:#fff;border-bottom:1px solid #e3e6eb;margin-bottom:16px}"+
               "h1{margin:0 0 8px 0}"+
               "nav{display:flex;gap:8px;margin-bottom:8px}"+
               ".btn{display:inline-block;padding:8px 12px;border:1px solid #c5ccd6;border-radius:6px;background:#fff;color:#222;cursor:pointer} .btn:hover{background:#f0f2f5}"+
               ".btn.primary{background:#2563eb;color:#fff;border-color:#2563eb} .btn.primary:hover{background:#1d4ed8}"+
               ".card{background:#fff;border:1px solid #e3e6eb;border-radius:8px;padding:16px}"+
               "label{display:block;margin:8px 0} input,textarea{width:100%;padding:8px;border:1px solid #c5ccd6;border-radius:6px} textarea{min-height:100px}"+
               ".actions{display:flex;gap:8px;margin-top:8px}"+
               ".product{background:#fff;border:1px solid #e3e6eb;border-radius:8px;overflow:hidden;display:flex;flex-direction:column;margin-bottom:12px}"+
               ".product img{width:100%;height:160px;object-fit:cover;background:#eee}"+
               ".product .content{padding:12px;display:flex;flex-direction:column;gap:8px} .product h3{margin:0;font-size:16px}";
    }

    private String buildAppJs(String listRenderer, String detailsRenderer) {
        StringBuilder js = new StringBuilder();
        js.append("(function(){\n");
        // state
        js.append("  var state={ products:[], product:null };\n");
        js.append("  var LS='products';\n");
        js.append("  function load(){ try{return JSON.parse(localStorage.getItem(LS))||[];}catch(e){return [];} }\n");
        js.append("  function save(list){ localStorage.setItem(LS, JSON.stringify(list)); }\n");
        js.append("  function seed(){ var l=load(); if(l.length===0){ l=[\n");
        js.append("    {id:Date.now(), name:'Sample Camera', image:'https://images.unsplash.com/photo-1519183071298-a2962be96f83?w=800', details:'A great camera for photography.'},\n");
        js.append("    {id:Date.now()+1, name:'Sample Headphones', image:'https://images.unsplash.com/photo-1518443895914-6e79f2d7b2a0?w=800', details:'Comfortable over-ear headphones.'}\n");
        js.append("  ]; save(l);} state.products=l; }\n");
        // nav
        js.append("  function show(view){ ['list','add','details'].forEach(function(v){ var s=document.getElementById('view-'+v); if(s) s.style.display=(v===view?'block':'none'); }); }\n");
        js.append("  function wireNav(){ document.querySelectorAll('[data-nav]').forEach(function(b){ b.addEventListener('click', function(){ show(b.getAttribute('data-nav')); if(b.getAttribute('data-nav')==='list'){ renderList(); } }); }); }\n");
        // CRUD
        js.append("  function addProduct(p){ p.id=Date.now(); state.products.push(p); save(state.products); renderList(); show('list'); }\n");
        js.append("  function updateProduct(u){ var i=state.products.findIndex(function(x){return String(x.id)===String(u.id)}); if(i>-1){ state.products[i]=u; save(state.products);} }\n");
        js.append("  function deleteProduct(id){ state.products=state.products.filter(function(x){return String(x.id)!==String(id)}); save(state.products); renderList(); }\n");
        // templated renderers
        js.append(listRenderer);
        js.append(detailsRenderer);
        // component glue
        js.append("  function renderList(){ var host=document.getElementById('listHost'); if(!host) return;\n");
        js.append("    host.onselected = function(ev){ state.product=ev.detail; renderDetails(); show('details'); };\n");
        // delegate selectedProduct event
        js.append("    host.addEventListener('selectedProduct', function(ev){ state.product=ev.detail; renderDetails(); show('details'); });\n");
        js.append("    renderProductList(host, state);\n");
        js.append("  }\n");
        js.append("  function renderDetails(){ var host=document.getElementById('detailsHost'); if(!host) return; renderProductDetails(host, state); }\n");
        // add form
        js.append("  function wireForm(){ var f=document.getElementById('productForm'); if(!f) return; f.addEventListener('submit', function(e){ e.preventDefault(); var name=document.getElementById('name').value.trim(); if(!name){ alert('Name is required'); return;} var image=document.getElementById('image').value.trim(); var details=document.getElementById('details').value.trim(); addProduct({name:name,image:image,details:details}); }); }\n");
        // init
        js.append("  function init(){ seed(); wireNav(); renderList(); wireForm(); show('list'); }\n");
        js.append("  document.addEventListener('DOMContentLoaded', init);\n");
        js.append("})();\n");
        return js.toString();
    }

    private void write(String fileName, String content) throws IOException {
        Files.write(outputDir.resolve(fileName), content.getBytes(StandardCharsets.UTF_8));
    }
}


