import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';


@Injectable({
    providedIn: 'root'
  })


export class ContractService {

    selectedContract:Contract;
    
    apiUrl = 'http://localhost:8080';

    constructor(private http: HttpClient) { }

    postData(contract): Observable<any> {

        return this.http.post<any>(`${this.apiUrl}/add-contract`,contract);

    }
    getData(): Observable<any> {
        return this.http.get<any>(`${this.apiUrl}/view-all-contracts`);
      }


      deleteData(contract: Contract): Observable<any> {
        return this.http.delete<any>(`${this.apiUrl}/delete-contract/${contract.contarctno}`);
      }

      updateData(contract): Observable<any> {
        return this.http.put<any>(`${this.apiUrl}/update-contract`, contract);
      }
}