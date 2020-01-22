import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})

export class ProductService {
    selectedProduct: Product;


    apiUrl = 'http://localhost:8080';
    constructor(private http: HttpClient) { }

    postData(product): Observable<any> {

        return this.http.post<any>(`${this.apiUrl}/add-product`,product);

    }

    getData(): Observable<any> {
        return this.http.get<any>(`${this.apiUrl}/view-all-products`);
      }


      deleteData(product: Product): Observable<any> {
        return this.http.delete<any>(`${this.apiUrl}/delete-product/${product.pid}`);
      }

      updateData(product): Observable<any> {
        return this.http.put<any>(`${this.apiUrl}/update-product`, product);
      }
}