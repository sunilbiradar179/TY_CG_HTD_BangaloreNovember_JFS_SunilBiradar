import { Component, OnInit } from '@angular/core';
import { SchedulerService } from '../scheduler.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-update-scheduler',
  templateUrl: './update-scheduler.component.html',
  styleUrls: ['./update-scheduler.component.css']
})
export class UpdateSchedulerComponent implements OnInit {

  constructor(private schedulerService:SchedulerService,private router: Router) { }

  ngOnInit() {
  }

  updateScheduler(form: NgForm) {
    this.schedulerService.updateData(form.value).subscribe( response => {
      console.log(response);
      if (response.statusCode === 201) {
        form.reset();
        this.router.navigateByUrl('/view-schedulers');
      }
    }, error => {
      console.log(error);
    } );
  }


}
