import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})

export class SchedulerService {
   selectedScheduler:Scheduler;

   apiUrl = 'http://localhost:8080';
   
    constructor(private http: HttpClient) {}

    postData(scheduler): Observable<any> {

        return this.http.post<any>(`${this.apiUrl}/register-scheduler`,scheduler);

    }

    getData(): Observable<any> {
        return this.http.get<any>(`${this.apiUrl}/view-all-shedulers`);
      }

      deleteData(scheduler: Scheduler): Observable<any> {
        return this.http.delete<any>(`${this.apiUrl}/delete-scheduler/${scheduler.id}`);
      }

      updateData(scheduler): Observable<any> {
        return this.http.put<any>(`${this.apiUrl}/change-scheduler-password`, scheduler);
      }
}