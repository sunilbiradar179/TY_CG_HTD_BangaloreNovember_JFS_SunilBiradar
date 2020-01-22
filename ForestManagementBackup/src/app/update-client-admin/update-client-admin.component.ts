import { Component, OnInit } from '@angular/core';
import { ClientService } from '../client.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-update-client-admin',
  templateUrl: './update-client-admin.component.html',
  styleUrls: ['./update-client-admin.component.css']
})
export class UpdateClientAdminComponent implements OnInit {

  constructor(private clientService:ClientService, private router: Router) { }

  ngOnInit() {
  }

  updateClient(form: NgForm) {
    this.clientService.updateData(form.value).subscribe( response => {
      console.log(response);
      if (response.statusCode === 201) {
        form.reset();
        this.router.navigateByUrl('/view-client');
      }
    }, error => {
      console.log(error);
    } );
  }

}
