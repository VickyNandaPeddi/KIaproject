import {Injectable} from '@angular/core';
import {HttpClient, HttpErrorResponse, HttpHeaders} from '@angular/common/http';
import {Observable, throwError} from 'rxjs';
import {catchError} from 'rxjs/operators';
import {Orders} from '../Model/orders';

// import { Requester } from './requester';

@Injectable({
  providedIn: 'root'
})
export class MaterialService {

  constructor(private  http: HttpClient) {
  }

  url: string = "http://localhost:3000/materials";
  // requesterurl: string = "http://localhost:3000/requester";

  // public getTodos():Observable<Orders[]>{
  //   return this.http.get<Orders[]>(`${this.url}Orders`)
  // }

  public getMaterials(): Observable<any> {
    return this.http.get("http://localhost:1001/MmProdReqHeaderEntity/mmproductrequestheader")
  }

  // public getRDetails():Observable<Requester[]>{
  //   return this.http.get<Requester[]>(`${this.requesterurl}`)
  // }

  // Delete
  deleteMaterial(id: any): Observable<any> {
    var API_URL = `${this.url}/${id}`;
    return this.http.delete(API_URL).pipe(
      catchError(this.handleError)
    )
  }

  placeOrder(orderObj: any): Observable<any> {
    return this.http.post("http://localhost:1001/MmProdReqHeaderEntity/mmproductrequestheader", JSON.stringify(orderObj));
  }

  // Handle API errors
  handleError(error: HttpErrorResponse) {
    if (error.error instanceof ErrorEvent) {
      console.error('An error occurred:', error.error.message);
    } else {
      console.error(
        `Backend returned code ${error.status}, ` +
        `body was: ${error.error}`);
    }
    return throwError(
      'Something bad happened; please try again later.');
  };


  addtocart(){

  }
}
