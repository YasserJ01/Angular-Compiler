import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    <div class="shell">
      <header>
        <h1>Product Manager</h1>
        <nav>
          <button (click)="show='list'">List</button>
          <button (click)="show='add'">Add</button>
        </nav>
      </header>

      <!-- LIST -->
      <section *ngIf="show==='list'">
        <h2>All Products</h2>
        <div class="grid">
          <div *ngFor="let p of products" class="card" (click)="select(p)">
            <img [src]="p.image" [alt]="p.name">
            <h3>{{ p.name }}</h3>
            <span>${{ p.price }}</span><br>
            <button (click)="delete(p); $event.stopPropagation()">Delete</button>
          </div>
        </div>
      </section>

      <!-- ADD / EDIT -->
      <section *ngIf="show==='add'">
        <h2>{{ editIndex === null ? 'Add' : 'Edit' }} Product</h2>
        <form (submit)="save($event)">
          <label>Name:
            <input [(value)]="form.name" required>
          </label>
          <label>Price:
            <input type="number" [(value)]="form.price" required>
          </label>
          <label>Image URL:
            <input [(value)]="form.image" required>
          </label>
          <button type="submit">Save</button>
          <button type="button" (click)="cancel()">Cancel</button>
        </form>
      </section>

      <!-- DETAILS -->
      <section *ngIf="selected && show==='list'">
        <h2>{{ selected.name }}</h2>
        <img [src]="selected.image" style="max-width:400px">
        <p>${{ selected.price }}</p>
      </section>
    </div>
  `,
  styles: [`
    body { margin:0; font-family:system-ui; background:#f6f7f9 }
    .shell { max-width:960px; margin:0 auto; padding:16px }
    header { display:flex; justify-content:space-between; align-items:center; margin-bottom:16px }
    .grid { display:grid; grid-template-columns:repeat(auto-fill,minmax(200px,1fr)); gap:12px }
    .card { border:1px solid #ddd; border-radius:6px; padding:8px; cursor:pointer; background:#fff }
    img { width:100%; height:120px; object-fit:cover; border-radius:4px }
    form label { display:block; margin:.5em 0 }
  `]
})
export class ProductAppComponent {
  show = 'list';
  products = [
    { id: 1, name: 'iPhone 15', price: 999, image: 'https://picsum.photos/seed/ip15/400' },
    { id: 2, name: 'Galaxy S24', price: 899, image: 'https://picsum.photos/seed/gs24/400' }
  ];
  selected = null;
  editIndex = null;
  form = { name: '', price: 0, image: '' };

  select(p) { this.selected = p; }
  delete(p) {
    this.products = this.products.filter(x => x !== p);
    if (this.selected === p) this.selected = null;
  }
  save(e) {
    e.preventDefault();
    const item = { ...this.form, id: Date.now() };
    if (this.editIndex === null) this.products.push(item);
    else this.products[this.editIndex] = item;
    this.show = 'list'; this.reset();
  }
  cancel() { this.reset(); this.show = 'list'; }
  reset() { this.form = { name: '', price: 0, image: '' }; this.editIndex = null; }
}