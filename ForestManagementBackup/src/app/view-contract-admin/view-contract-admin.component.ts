import { Component, OnInit } from '@angular/core';
import { ContractService } from '../contract.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view-contract-admin',
  templateUrl: './view-contract-admin.component.html',
  styleUrls: ['./view-contract-admin.component.css']
})
export class ViewContractAdminComponent implements OnInit {
  message: string;
  contracts:Contract[];
  constructor(private contractService:ContractService, private router: Router) { 
    this.getContracts();
  }

  ngOnInit() {
  }
  getContracts() {
    this.contractService.getData().subscribe( data => {
      console.log(data);
      this.contracts = data.beans;
    }, error => {
      console.log(error);
    });
  }

  deleteContract(contract: Contract) {
    this.contractService.deleteData(contract).subscribe( response => {
      console.log(response);
      this.message = response.message;
      if (response.statusCode === 201) {
        this.contracts.splice(this.contracts.indexOf(contract), 1);
      }
    });
  }

  deleteMessage() {
    this.message = null;
  }

  selectContract(contract) {
    this.contractService.selectedContract = contract;
    this.router.navigateByUrl('/update-contract');
  }
}
