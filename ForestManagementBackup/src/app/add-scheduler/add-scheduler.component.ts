import { Component, OnInit } from '@angular/core';
import { SchedulerService } from '../scheduler.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-scheduler',
  templateUrl: './add-scheduler.component.html',
  styleUrls: ['./add-scheduler.component.css']
})
export class AddSchedulerComponent implements OnInit {
  message: string;
  schedulers:Scheduler[];
  constructor(private schedulerService:SchedulerService) { }

  ngOnInit() {
  }

  addScheduler(form: NgForm) {
    this.schedulerService.postData(form.value).subscribe(data => {
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
