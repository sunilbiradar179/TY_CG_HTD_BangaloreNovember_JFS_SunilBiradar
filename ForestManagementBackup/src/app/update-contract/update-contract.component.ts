import { Component, OnInit } from '@angular/core';
import { ContractService } from '../contract.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-update-contract',
  templateUrl: './update-contract.component.html',
  styleUrls: ['./update-contract.component.css']
})
export class UpdateContractComponent implements OnInit {

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
