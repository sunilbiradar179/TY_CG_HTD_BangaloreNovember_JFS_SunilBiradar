import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
    providedIn: 'root'
  })

export class ClientService {
    selectedProduct: Client;



    apiUrl = 'http://localhost:8080';

    constructor(private http: HttpClient) {}
    postData(client): Observable<any> {

        return this.http.post<any>(`${this.apiUrl}/register-client`,client);

    }

    getData(): Observable<any> {
        return this.http.get<any>(`${this.apiUrl}/view-all-clients`);
      }

      deleteData(client: Client): Observable<any> {
        return this.http.delete<any>(`${this.apiUrl}/delete-client/${client.id}`);
      }

      updateData(client): Observable<any> {
        return this.http.put<any>(`${this.apiUrl}/change-client-password`, client);
      }
}