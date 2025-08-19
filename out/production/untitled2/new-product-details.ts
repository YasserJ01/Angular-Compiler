import { Component, Input } from '@angular/core';

@Component({
  selector: 'new-product-details',
  standalone: true,
  template: `
    <div *ngIf="product" class="card">
      <img [src]="product.image" alt="{{ product.name }}" style="width:100%;max-height:360px;object-fit:cover"/>
      <h2>{{ product.name }}</h2>
      <p>{{ product.details }}</p>
    </div>
    <div *ngIf="!product" class="card">
      <p>Please select a product.</p>
    </div>
  `
})
export class NewProductDetailsComponent {
  @Input() product: any;
}


