(function(){
  var state={ products:[], product:null };
  var LS='products';
  function load(){ try{return JSON.parse(localStorage.getItem(LS))||[];}catch(e){return [];} }
  function save(list){ localStorage.setItem(LS, JSON.stringify(list)); }
  function seed(){ var l=load(); if(l.length===0){ l=[
    {id:Date.now(), name:'Sample Camera', image:'https://images.unsplash.com/photo-1519183071298-a2962be96f83?w=800', details:'A great camera for photography.'},
    {id:Date.now()+1, name:'Sample Headphones', image:'https://images.unsplash.com/photo-1518443895914-6e79f2d7b2a0?w=800', details:'Comfortable over-ear headphones.'}
  ]; save(l);} state.products=l; }
  function show(view){ ['list','add','details'].forEach(function(v){ var s=document.getElementById('view-'+v); if(s) s.style.display=(v===view?'block':'none'); }); }
  function wireNav(){ document.querySelectorAll('[data-nav]').forEach(function(b){ b.addEventListener('click', function(){ show(b.getAttribute('data-nav')); if(b.getAttribute('data-nav')==='list'){ renderList(); } }); }); }
  function addProduct(p){ p.id=Date.now(); state.products.push(p); save(state.products); renderList(); show('list'); }
  function updateProduct(u){ var i=state.products.findIndex(function(x){return String(x.id)===String(u.id)}); if(i>-1){ state.products[i]=u; save(state.products);} }
  function deleteProduct(id){ state.products=state.products.filter(function(x){return String(x.id)!==String(id)}); save(state.products); renderList(); }
function renderProductList(host, scope){
  host.innerHTML='';
  (scope.products||[]).forEach(function(product){
    var card=document.createElement('div'); card.className='product';
    var img=document.createElement('img'); img.src=(product.image)||'https://via.placeholder.com/400x300?text=No+Image'; img.alt=(''+(product.name||'')); card.appendChild(img);
    var content=document.createElement('div'); content.className='content';
    var h3=document.createElement('h3'); h3.textContent=(''+(product.name||'')); content.appendChild(h3);
    card.addEventListener('click', function(){ host.dispatchEvent(new CustomEvent('selectedProduct',{detail:product})); });
    card.appendChild(content);
    host.appendChild(card);
  });
}
function renderProductDetails(host, scope){
  host.innerHTML='';
  if(scope.product){
    var img=document.createElement('img'); img.src=(scope.product && scope.product.image)||'https://via.placeholder.com/800x500?text=No+Image'; img.alt=(''+(scope.product?scope.product.name:'')); img.style.width='100%'; img.style.maxHeight='360px'; img.style.objectFit='cover'; host.appendChild(img);
    var h2=document.createElement('h2'); h2.textContent=(''+(scope.product?scope.product.name:'')); host.appendChild(h2);
    var p=document.createElement('p'); p.textContent=(''+(scope.product?scope.product.details:'')); host.appendChild(p);
  } else {
    var msg=document.createElement('p'); msg.textContent='Please select a product.'; host.appendChild(msg);
  }
}
  function renderList(){ var host=document.getElementById('listHost'); if(!host) return;
    host.onselected = function(ev){ state.product=ev.detail; renderDetails(); show('details'); };
    host.addEventListener('selectedProduct', function(ev){ state.product=ev.detail; renderDetails(); show('details'); });
    renderProductList(host, state);
  }
  function renderDetails(){ var host=document.getElementById('detailsHost'); if(!host) return; renderProductDetails(host, state); }
  function wireForm(){ var f=document.getElementById('productForm'); if(!f) return; f.addEventListener('submit', function(e){ e.preventDefault(); var name=document.getElementById('name').value.trim(); if(!name){ alert('Name is required'); return;} var image=document.getElementById('image').value.trim(); var details=document.getElementById('details').value.trim(); addProduct({name:name,image:image,details:details}); }); }
  function init(){ seed(); wireNav(); renderList(); wireForm(); show('list'); }
  document.addEventListener('DOMContentLoaded', init);
})();
