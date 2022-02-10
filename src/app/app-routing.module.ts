import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {RouterModule, Routes} from '@angular/router';
import {PlaceOrderComponent} from "./Component/place-order/place-order.component";
import {OrderSummaryComponent} from "./Component/order-summary/order-summary.component";


const routes: Routes = [{
  path: "ordersummary", component: OrderSummaryComponent, pathMatch: "full"
},
  {path: "placeorder", component: PlaceOrderComponent, pathMatch: "full"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
