import {Component, OnInit} from '@angular/core';
import {Orders} from "../../Model/orders";
import {MaterialService} from "../../services/material.service";
import {Productmaster} from "../../Model/Productmaster";
import {PlaceOrderService} from "../../services/place-order.service";

@Component({
  selector: 'app-order-summary',
  templateUrl: './order-summary.component.html',
  styleUrls: ['./order-summary.component.css']
})
export class OrderSummaryComponent implements OnInit {

  orders: Productmaster[] = [];
  model: any = {};

  constructor(private placeOrderService: PlaceOrderService) {
  }

  ngOnInit(): void {
    this.getOrders();
    // this.model = {
    //   "mmProdReqHeaderEntity": {
    //     "reqNbr": "req022022001",
    //     "reqDate": "2022-02-03T08:43:11.517+00:00",
    //     "reqDept": 1,
    //     "reqSection": 1,
    //     "reqLine": 1,
    //     "requestedBy": 1,
    //     "orderType": "xyz",
    //     "prcsStatusId": 1,
    //     "statusId": 1,
    //     "sicComments": "comments",
    //     "aicComments": "aiccomment",
    //     "createdBy": 1,
    //     "createdOn": "2022-02-03T08:43:11.517+00:00"
    //   },
    //   "mmProdReqDetailsEntity": [
    //     {
    //
    //       "prodMasterId": 1,
    //       "orderedQty": 10,
    //       "uomId": 1,
    //       "expiryDate": "2022-02-03",
    //       "statusId": 1,
    //       "createdBy": 1,
    //       "createdOn": "2022-02-03T08:43:11.517+00:00"
    //     },
    //     {
    //
    //       "prodMasterId": 1,
    //       "orderedQty": 10,
    //       "uomId": 1,
    //       "expiryDate": "2022-02-03",
    //       "statusId": 1,
    //       "createdBy": 1,
    //       "createdOn": "2022-02-03T08:43:11.517+00:00"
    //     }
    //
    //   ]
    // }
  }

  private getOrders() {
    // @ts-ignore
    this.placeOrderService.getallProducts().subscribe((items) => {
      this.orders = items;
      console.log(this.orders)
    });
  }

  // placeOrder() {
  //   this.orderservice.placeOrder(this.model).subscribe(data => {
  //     console.log(data);
  //   })
  // }

  // deleteOrder(id: any) {
  //   this.orderservice.deleteMaterial(id).subscribe((response) => {
  //     this.getOrders();
  //   }, (error => {
  //   }));
  // }

  placeOrder() {

  }
}
