import { Component, OnInit } from '@angular/core';
import { SchedulerService } from '../scheduler.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-update-scheduler-admin',
  templateUrl: './update-scheduler-admin.component.html',
  styleUrls: ['./update-scheduler-admin.component.css']
})
export class UpdateSchedulerAdminComponent implements OnInit {

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
