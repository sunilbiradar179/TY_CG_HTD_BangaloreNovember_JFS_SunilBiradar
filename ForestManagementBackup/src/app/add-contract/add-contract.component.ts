import { Component, OnInit } from '@angular/core';
import { ContractService } from '../contract.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-contract',
  templateUrl: './add-contract.component.html',
  styleUrls: ['./add-contract.component.css']
})
export class AddContractComponent implements OnInit {
  message: string;
  today;


  constructor(private contractService:ContractService) { 
    let todayDate = new Date();
    let date = todayDate.getDate();
    let year = todayDate.getFullYear();
    let month = todayDate.getMonth() + 1;

    if(todayDate.getMonth() > 8) {
      this.today = year + '-' + month + '-' + date;
    } else {
      this.today = year + '-' + '0' + 'month' + '-' + date;
    }

  }

  ngOnInit() {
  }

  addContract(form: NgForm) {
    this.contractService.postData(form.value).subscribe(data => {
      console.log(data);
      this.message = data.message;
      setTimeout(() => {
        this.message = null;
      }, 2000);
      form.reset();

    }, err => {
      console.log(err);
    });
  }

}
