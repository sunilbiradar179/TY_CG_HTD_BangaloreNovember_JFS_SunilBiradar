import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view-customers',
  templateUrl: './view-customers.component.html',
  styleUrls: ['./view-customers.component.css']
})
export class ViewCustomersComponent implements OnInit {
  message: string;
  customers: Customer[];


  constructor(private customerService: CustomerService, private router: Router) { 

    this.getCustomers();
  }



  ngOnInit() {
  }


  getCustomers() {
    this.customerService.getData().subscribe( data => {
      console.log(data);
      this.customers = data.beans;
    }, error => {
      console.log(error);
    });
  }

  deleteCustomer(customer: Customer) {
    this.customerService.deleteData(customer).subscribe( response => {
      console.log(response);
      this.message = response.message;
      if (response.statusCode === 201) {
        this.customers.splice(this.customers.indexOf(customer), 1);
      }
    });
  }

  deleteMessage() {
    this.message = null;
  }

  selectCustomer(customer) {
    this.customerService.selectedCustomer = customer;
    this.router.navigateByUrl('/update-customer');
  }

}
