import { Component, OnInit } from '@angular/core';
import { SchedulerService } from '../scheduler.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view-schedulers',
  templateUrl: './view-schedulers.component.html',
  styleUrls: ['./view-schedulers.component.css']
})
export class ViewSchedulersComponent implements OnInit {
  message: string;
  schedulers:Scheduler[];
  constructor(private schedulerService:SchedulerService,private router: Router) { 
    this.getSchedulers();
  }

  ngOnInit() {
  }

  getSchedulers() {
    this.schedulerService.getData().subscribe( data => {
      console.log(data);
      this.schedulers = data.beans;
    }, error => {
      console.log(error);
    });
  }

  deleteScheduler(scheduler: Scheduler) {
    this.schedulerService.deleteData(scheduler).subscribe( response => {
      console.log(response);
      this.message = response.message;
      if (response.statusCode === 201) {
        this.schedulers.splice(this.schedulers.indexOf(scheduler), 1);
      }
    });
  }
  deleteMessage() {
    this.message = null;
  }

  selectScheduler(scheduler) {
    this.schedulerService.selectedScheduler = scheduler;
    this.router.navigateByUrl('/update-scheduler');
  }


}
