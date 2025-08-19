package CodeGen;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CodeGenerator {
    private final Path outputDir;

    public CodeGenerator() {
        this.outputDir = Paths.get("dist");
    }

    public void generate() throws IOException {
        createDirs();
        writeIndex();
        writeAdd();
        writeProducts();
        writeDetails();
        writeStyles();
        writeAppJs();
    }

    private void createDirs() throws IOException {
        if (!Files.exists(outputDir)) {
            Files.createDirectories(outputDir);
        }
    }

    private void writeIndex() throws IOException {
        String html = "<!doctype html>\n" +
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
                "      <a class=\"btn\" href=\"add.html\">Add Product</a>\n" +
                "      <a class=\"btn\" href=\"products.html\">View Products</a>\n" +
                "    </nav>\n" +
                "  </header>\n" +
                "  <main class=\"container\">\n" +
                "    <p>Use the navigation above to manage your products.</p>\n" +
                "  </main>\n" +
                "</body>\n" +
                "</html>\n";
        write("index.html", html);
    }

    private void writeAdd() throws IOException {
        String html = "<!doctype html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <meta charset=\"utf-8\"/>\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\n" +
                "  <title>Add Product</title>\n" +
                "  <link rel=\"stylesheet\" href=\"styles.css\"/>\n" +
                "</head>\n" +
                "<body>\n" +
                "  <header class=\"container\">\n" +
                "    <h1>Add Product</h1>\n" +
                "    <nav>\n" +
                "      <a class=\"btn\" href=\"index.html\">Home</a>\n" +
                "      <a class=\"btn\" href=\"products.html\">View Products</a>\n" +
                "    </nav>\n" +
                "  </header>\n" +
                "  <main class=\"container\">\n" +
                "    <form id=\"productForm\" class=\"card\">\n" +
                "      <label>Name<input id=\"name\" type=\"text\" placeholder=\"Product name\" required/></label>\n" +
                "      <label>Image URL<input id=\"image\" type=\"url\" placeholder=\"https://...\"/></label>\n" +
                "      <label>Details<textarea id=\"details\" placeholder=\"Describe the product\"></textarea></label>\n" +
                "      <div class=\"actions\">\n" +
                "        <button class=\"btn primary\" type=\"submit\">Save</button>\n" +
                "        <a class=\"btn\" href=\"products.html\">Cancel</a>\n" +
                "      </div>\n" +
                "    </form>\n" +
                "  </main>\n" +
                "  <script src=\"app.js\"></script>\n" +
                "</body>\n" +
                "</html>\n";
        write("add.html", html);
    }

    private void writeProducts() throws IOException {
        String html = "<!doctype html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <meta charset=\"utf-8\"/>\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\n" +
                "  <title>Products</title>\n" +
                "  <link rel=\"stylesheet\" href=\"styles.css\"/>\n" +
                "</head>\n" +
                "<body>\n" +
                "  <header class=\"container\">\n" +
                "    <h1>Products</h1>\n" +
                "    <nav>\n" +
                "      <a class=\"btn\" href=\"index.html\">Home</a>\n" +
                "      <a class=\"btn\" href=\"add.html\">Add Product</a>\n" +
                "    </nav>\n" +
                "  </header>\n" +
                "  <main class=\"container\">\n" +
                "    <div id=\"productsList\" class=\"grid\"></div>\n" +
                "  </main>\n" +
                "  <script src=\"app.js\"></script>\n" +
                "</body>\n" +
                "</html>\n";
        write("products.html", html);
    }

    private void writeDetails() throws IOException {
        String html = "<!doctype html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <meta charset=\"utf-8\"/>\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\n" +
                "  <title>Product Details</title>\n" +
                "  <link rel=\"stylesheet\" href=\"styles.css\"/>\n" +
                "</head>\n" +
                "<body>\n" +
                "  <header class=\"container\">\n" +
                "    <h1>Product Details</h1>\n" +
                "    <nav>\n" +
                "      <a class=\"btn\" href=\"products.html\">Back to Products</a>\n" +
                "    </nav>\n" +
                "  </header>\n" +
                "  <main class=\"container\">\n" +
                "    <div id=\"productDetails\" class=\"card\"></div>\n" +
                "  </main>\n" +
                "  <script src=\"app.js\"></script>\n" +
                "</body>\n" +
                "</html>\n";
        write("details.html", html);
    }

    private void writeStyles() throws IOException {
        String css = "*{box-sizing:border-box}body{margin:0;font-family:system-ui,-apple-system,Segoe UI,Roboto,Helvetica,Arial,sans-serif;background:#f6f7f9;color:#222}" +
                ".container{max-width:960px;margin:0 auto;padding:16px}" +
                "header{background:#fff;border-bottom:1px solid #e3e6eb;margin-bottom:16px}" +
                "h1{margin:0 0 8px 0}" +
                "nav{display:flex;gap:8px;margin-bottom:8px}" +
                ".btn{display:inline-block;padding:8px 12px;border:1px solid #c5ccd6;border-radius:6px;background:#fff;color:#222;text-decoration:none;cursor:pointer} .btn:hover{background:#f0f2f5}" +
                ".btn.primary{background:#2563eb;color:#fff;border-color:#2563eb} .btn.primary:hover{background:#1d4ed8}" +
                ".card{background:#fff;border:1px solid #e3e6eb;border-radius:8px;padding:16px}" +
                "label{display:block;margin:8px 0} input,textarea{width:100%;padding:8px;border:1px solid #c5ccd6;border-radius:6px} textarea{min-height:100px}" +
                ".actions{display:flex;gap:8px;margin-top:8px}" +
                ".grid{display:grid;grid-template-columns:repeat(auto-fill,minmax(220px,1fr));gap:16px}" +
                ".product{background:#fff;border:1px solid #e3e6eb;border-radius:8px;overflow:hidden;display:flex;flex-direction:column}" +
                ".product img{width:100%;height:160px;object-fit:cover;background:#eee}" +
                ".product .content{padding:12px;display:flex;flex-direction:column;gap:8px} .product h3{margin:0;font-size:16px}";
        write("styles.css", css);
    }

    private void writeAppJs() throws IOException {
        String js = "(function(){\n" +
                "  const LS_KEY = 'products';\n" +
                "  function getProducts(){ try{ return JSON.parse(localStorage.getItem(LS_KEY)) || []; }catch(e){ return []; } }\n" +
                "  function saveProducts(list){ localStorage.setItem(LS_KEY, JSON.stringify(list)); }\n" +
                "  function seed(){ const list = getProducts(); if(list.length===0){ saveProducts([\n" +
                "    {id: Date.now(), name:'Sample Camera', image:'https://images.unsplash.com/photo-1519183071298-a2962be96f83?w=800', details:'A great camera for photography.'},\n" +
                "    {id: Date.now()+1, name:'Sample Headphones', image:'https://images.unsplash.com/photo-1518443895914-6e79f2d7b2a0?w=800', details:'Comfortable over-ear headphones.'}\n" +
                "  ]); } }\n" +
                "  function addProduct(p){ const list=getProducts(); p.id = Date.now(); list.push(p); saveProducts(list); }\n" +
                "  function deleteProduct(id){ let list=getProducts(); list=list.filter(p=>String(p.id)!==String(id)); saveProducts(list); }\n" +
                "  function updateProduct(updated){ const list=getProducts(); const idx=list.findIndex(p=>String(p.id)===String(updated.id)); if(idx>-1){ list[idx]=updated; saveProducts(list);} }\n" +
                "  function byId(id){ return document.getElementById(id); }\n" +
                "  function on(el,ev,fn){ el.addEventListener(ev,fn); }\n" +
                "  function q(sel){ return document.querySelector(sel); }\n" +
                "  function renderProducts(){ const mount=byId('productsList'); if(!mount) return; const list=getProducts(); mount.innerHTML=''; list.forEach(p=>{\n" +
                "      const card=document.createElement('div'); card.className='product';\n" +
                "      const img=document.createElement('img'); img.src=p.image||'https://via.placeholder.com/400x300?text=No+Image'; img.alt=p.name;\n" +
                "      const content=document.createElement('div'); content.className='content';\n" +
                "      const h3=document.createElement('h3'); h3.textContent=p.name;\n" +
                "      const actions=document.createElement('div'); actions.className='actions';\n" +
                "      const view=document.createElement('a'); view.className='btn'; view.textContent='View'; view.href='details.html?id='+encodeURIComponent(p.id);\n" +
                "      const edit=document.createElement('button'); edit.className='btn'; edit.textContent='Edit'; edit.onclick=function(){\n" +
                "        const name=prompt('Name', p.name) || p.name;\n" +
                "        const image=prompt('Image URL', p.image) || p.image;\n" +
                "        const details=prompt('Details', p.details) || p.details;\n" +
                "        updateProduct({id:p.id,name,image,details}); renderProducts();\n" +
                "      };\n" +
                "      const del=document.createElement('button'); del.className='btn'; del.textContent='Delete'; del.onclick=function(){ if(confirm('Delete '+p.name+'?')){ deleteProduct(p.id); renderProducts(); } };\n" +
                "      actions.appendChild(view); actions.appendChild(edit); actions.appendChild(del);\n" +
                "      content.appendChild(h3); content.appendChild(actions);\n" +
                "      card.appendChild(img); card.appendChild(content);\n" +
                "      mount.appendChild(card);\n" +
                "  }); }\n" +
                "  function initAdd(){ const form=byId('productForm'); if(!form) return; on(form,'submit',function(e){ e.preventDefault(); const name=byId('name').value.trim(); const image=byId('image').value.trim(); const details=byId('details').value.trim(); if(!name){ alert('Name is required'); return;} addProduct({name,image,details}); window.location.href='products.html'; }); }\n" +
                "  function renderDetails(){ const mount=byId('productDetails'); if(!mount) return; const params=new URLSearchParams(window.location.search); const id=params.get('id'); const p=getProducts().find(x=>String(x.id)===String(id)); if(!p){ mount.innerHTML='<p>Product not found.</p>'; return;} mount.innerHTML=''; const img=document.createElement('img'); img.src=p.image||'https://via.placeholder.com/800x500?text=No+Image'; img.alt=p.name; img.style.width='100%'; img.style.maxHeight='360px'; img.style.objectFit='cover'; const h2=document.createElement('h2'); h2.textContent=p.name; const desc=document.createElement('p'); desc.textContent=p.details||''; const del=document.createElement('button'); del.className='btn'; del.textContent='Delete'; del.onclick=function(){ if(confirm('Delete '+p.name+'?')){ deleteProduct(p.id); window.location.href='products.html'; } }; const edit=document.createElement('button'); edit.className='btn'; edit.textContent='Edit'; edit.onclick=function(){ const name=prompt('Name', p.name) || p.name; const image=prompt('Image URL', p.image) || p.image; const details=prompt('Details', p.details) || p.details; updateProduct({id:p.id,name,image,details}); renderDetails(); }; const back=document.createElement('a'); back.className='btn'; back.textContent='Back'; back.href='products.html'; const actions=document.createElement('div'); actions.className='actions'; actions.appendChild(edit); actions.appendChild(del); actions.appendChild(back); mount.appendChild(img); mount.appendChild(h2); mount.appendChild(desc); mount.appendChild(actions); }\n" +
                "  function init(){ seed(); initAdd(); renderProducts(); renderDetails(); }\n" +
                "  document.addEventListener('DOMContentLoaded', init);\n" +
                "})();\n";
        write("app.js", js);
    }

    private void write(String fileName, String content) throws IOException {
        Files.write(outputDir.resolve(fileName), content.getBytes(StandardCharsets.UTF_8));
    }
}


