import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  failure: string;
  exception: string;

  constructor(private loginService:LoginService,private router: Router) { }



  ngOnInit() {
  }


  login(form: NgForm) {
    this.loginService.login(form.value).subscribe( data => {
      console.log(data);
      if ( data.statusCode === 201) {
        console.log(data.message);
        localStorage.setItem('beans', JSON.stringify(data.beans['0']));
        if(data.beans['0'].type==='admin') {
          this.router.navigateByUrl('/admin');
        } else if (data.beans['0'].type==='client') {
          this.router.navigateByUrl('/client');
        } else {
          this.router.navigateByUrl('/scheduler');
        }
      }
      else if ( data.statusCode === 401 ) {
        this.failure = data.message;
        setInterval(() => {
          this.failure = null;
          }, 5000);
        }
          else  { 
            this.exception = data.message;
            setInterval(() => {
              this.exception = null;
              }, 5000);


            
      
      }
    });
  }

}
