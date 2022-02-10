import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Shoppingitem} from "../Model/Shoppingitem";
import {Productmaster} from "../Model/Productmaster";

@Injectable({
  providedIn: 'root'
})
export class PlaceOrderService {

  constructor(public httpClient: HttpClient) {


  }

  saveplaceorderdata(productmaster: Productmaster) {
    console.log(productmaster)
    this.httpClient.post("", productmaster);

  }

  //dummydata

  public getallProducts(): Productmaster[] {

    // @ts-ignore
    return this.httpClient.get("http://localhost:1001/mmproductmasterentity/mmproductmaster");
  }

}
