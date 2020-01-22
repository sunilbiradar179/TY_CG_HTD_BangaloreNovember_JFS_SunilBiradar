import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-update-customer-admin',
  templateUrl: './update-customer-admin.component.html',
  styleUrls: ['./update-customer-admin.component.css']
})
export class UpdateCustomerAdminComponent implements OnInit {

  constructor(private customerService:CustomerService,private router: Router) { }

  ngOnInit() {
  }

  updateCustomer(form: NgForm) {
    this.customerService.updateData(form.value).subscribe( response => {
      console.log(response);
      if (response.statusCode === 201) {
        form.reset();
        this.router.navigateByUrl('/view-customers');
      }
    }, error => {
      console.log(error);
    } );
  }

}
