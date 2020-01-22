import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-update-product',
  templateUrl: './update-product.component.html',
  styleUrls: ['./update-product.component.css']
})
export class UpdateProductComponent implements OnInit {

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
