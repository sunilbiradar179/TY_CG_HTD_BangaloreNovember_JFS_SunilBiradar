import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';

@Injectable({
    providedIn: 'root'
  })

export class CustomerService {
    selectedCustomer: Customer;

    apiUrl = 'http://localhost:8080';

    constructor(private http: HttpClient) {}


    postData(customer): Observable<any> {

        return this.http.post<any>(`${this.apiUrl}/add-customer`,customer);

    }
    getData(): Observable<any> {
        return this.http.get<any>(`${this.apiUrl}/view-all-customers`);
      }


      deleteData(customer: Customer): Observable<any> {
        return this.http.delete<any>(`${this.apiUrl}/delete-customer/${customer.custId}`);
      }

      updateData(customer): Observable<any> {
        return this.http.put<any>(`${this.apiUrl}/update-customer`, customer);
      }

}