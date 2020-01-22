import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view-products',
  templateUrl: './view-products.component.html',
  styleUrls: ['./view-products.component.css']
})
export class ViewProductsComponent implements OnInit {

  message: string;

  products: Product[];

  constructor(private productService: ProductService ,private router: Router) { 

    this.getProducts();
  }

  ngOnInit() {
  }

  getProducts() {
    this.productService.getData().subscribe( data => {
      console.log(data);
      this.products = data.beans;
    }, error => {
      console.log(error);
    });
  }

  deleteProduct(product: Product) {
    this.productService.deleteData(product).subscribe( response => {
      console.log(response);
      this.message = response.message;
      if (response.statusCode === 201) {
        this.products.splice(this.products.indexOf(product), 1);
      }
    });
  }

  deleteMessage() {
    this.message = null;
  }

  selectProduct(product) {
    this.productService.selectedProduct = product;
    this.router.navigateByUrl('/update-product');
  }




}
