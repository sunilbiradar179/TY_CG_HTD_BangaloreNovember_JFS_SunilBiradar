import { Component, OnInit } from '@angular/core';
import { ClientService } from '../client.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view-client',
  templateUrl: './view-client.component.html',
  styleUrls: ['./view-client.component.css']
})
export class ViewClientComponent implements OnInit {
  message: string;
  clients: Client[];
  constructor(private clientService: ClientService, private router: Router) { 
    this.getClients();
  }

  ngOnInit() {
  }

  getClients() {
    this.clientService.getData().subscribe( data => {
      console.log(data);
      this.clients = data.beans;
    }, error => {
      console.log(error);
    });
  }

  deleteClient(client: Client) {
    this.clientService.deleteData(client).subscribe( response => {
      console.log(response);
      this.message = response.message;
      if (response.statusCode === 201) {
        this.clients.splice(this.clients.indexOf(client), 1);
      }
    });
  }
  deleteMessage() {
    this.message = null;
  }

  selectClient(client) {
    this.clientService.selectedProduct = client;
    this.router.navigateByUrl('/update-client');
  }

}
