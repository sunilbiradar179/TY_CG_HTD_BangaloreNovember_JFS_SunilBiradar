import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-update-product-admin',
  templateUrl: './update-product-admin.component.html',
  styleUrls: ['./update-product-admin.component.css']
})
export class UpdateProductAdminComponent implements OnInit {

  constructor(private productService:ProductService,private router: Router) { }

  ngOnInit() {
  }
  updateProduct(form: NgForm) {
    this.productService.updateData(form.value).subscribe( response => {
      console.log(response);
      if (response.statusCode === 201) {
        form.reset();
        this.router.navigateByUrl('/view-products');
      }
    }, error => {
      console.log(error);
    } );
  }
}
