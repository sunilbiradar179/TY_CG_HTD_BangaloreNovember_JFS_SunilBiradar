import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ContractService } from '../contract.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-update-contract-admin',
  templateUrl: './update-contract-admin.component.html',
  styleUrls: ['./update-contract-admin.component.css']
})
export class UpdateContractAdminComponent implements OnInit {

  constructor(private contractService:ContractService, private router: Router) { }

  ngOnInit() {
  }

  updateContract(form: NgForm) {
    this.contractService.updateData(form.value).subscribe( response => {
      console.log(response);
      if (response.statusCode === 201) {
        form.reset();
        this.router.navigateByUrl('/view-contracts');
      }
    }, error => {
      console.log(error);
    } );
  }


}
