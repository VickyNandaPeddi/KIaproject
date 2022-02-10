import {Component, OnInit} from '@angular/core';
import {MaterialService} from "../../services/material.service";
import {Shoppingitem} from "../../Model/Shoppingitem";
import {PlaceOrderService} from "../../services/place-order.service";
import {Productmaster} from "../../Model/Productmaster";

interface City {
  name: string,
}

@Component({
  selector: 'app-place-order',
  templateUrl: './place-order.component.html',
  styleUrls: ['./place-order.component.css']
})
export class PlaceOrderComponent implements OnInit {
  lines: City[];
  // @ts-ignore
  public shoppingItems: Shoppingitem[];
  selectedLine: any;
  selectedAccessories: any;
  // @ts-ignore
  checked: boolean[] ;
  disabled = true;

// @ts-ignore
  public productmaster: Productmaster[];

  constructor(public placeorderservice: PlaceOrderService) {
    this.lines = [
      {name: 'Line 1'},
      {name: 'Line 2'},
      {name: 'Line 3'},
      {name: 'Line 4'},
      {name: 'Line 5'},
      {name: 'Line 6'},
      {name: 'Line 7'},
      {name: 'Line 8'},
      {name: 'Line 9'},
      {name: 'Line 10'}
    ];
    // this.selectedLine = { name: "" };
    // this.shoppingItems = [
    //   {
    //     image: '/assets/images/phillips bit.png',
    //     title: 'Phillis bit',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Main Line + Repair Spare',
    //     subtitle3: 'GT876778888876546',
    //   },
    //   {
    //     image: '/assets/images/funnel.png',
    //     title: 'FUNNEL WITH FILTER',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Repair Miscellaneous Tools',
    //     subtitle3: 'GT710201902130008',
    //   },
    //   {
    //     image: '/assets/images/protection.png',
    //     title: 'PROTECTION COVER FOR URYU URW 80R',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Ratchet tool cover',
    //     subtitle3: 'SM812201905130003',
    //   },
    //   {
    //     image: '/assets/images/torx key.png',
    //     title: 'TORX KEY SET SOCKET TYPE',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Keeper and repair tools',
    //     subtitle3: 'GT710201810030078',
    //   },
    //   {
    //     image: '/assets/images/multimeter.png',
    //     title: 'MULTIMETER',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Main Line + Repair Spare',
    //     subtitle3: 'GT87677888884346',
    //   },
    //   {
    //     image: '/assets/images/deep socket.png',
    //     title: 'Deep Socket',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Main Line + Repair Spare',
    //     subtitle3: 'GT8767788883376546',
    //   },
    //   {
    //     image: '/assets/images/bit socket.png',
    //     title: 'Bit Socket',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Main Line + Repair Spare',
    //     subtitle3: 'GT87677887776546',
    //   },
    //   {
    //     image: '/assets/images/locking wheel.png',
    //     title: 'Locking wheel nut removal sockets',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Main Line + Repair Spare',
    //     subtitle3: 'GT876778887876546',
    //   },
    //   {
    //     image: '/assets/images/deep socket.png',
    //     title: 'Deep Socket',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Main Line + Repair Spare',
    //     subtitle3: 'GT8767788883376546',
    //   },
    //   {
    //     image: '/assets/images/bit socket.png',
    //     title: 'Bit Socket',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Main Line + Repair Spare',
    //     subtitle3: 'GT87677887776546',
    //   },
    //   {
    //     image: '/assets/images/locking wheel.png',
    //     title: 'Locking wheel nut removal sockets',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Main Line + Repair Spare',
    //     subtitle3: 'GT876778887876546',
    //   },
    //   {
    //     image: '/assets/images/deep socket.png',
    //     title: 'Deep Socket',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Main Line + Repair Spare',
    //     subtitle3: 'GT8767788883376546',
    //   },
    //   {
    //     image: '/assets/images/bit socket.png',
    //     title: 'Bit Socket',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Main Line + Repair Spare',
    //     subtitle3: 'GT87677887776546',
    //   },
    //   {
    //     image: '/assets/images/locking wheel.png',
    //     title: 'Locking wheel nut removal sockets',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Main Line + Repair Spare',
    //     subtitle3: 'GT876778887876546',
    //   },
    //   {
    //     image: '/assets/images/deep socket.png',
    //     title: 'Deep Socket',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Main Line + Repair Spare',
    //     subtitle3: 'GT8767788883376546',
    //   },
    //   {
    //     image: '/assets/bit socket.png',
    //     title: 'Bit Socket',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Main Line + Repair Spare',
    //     subtitle3: 'GT87677887776546',
    //   },
    //   {
    //     image: '/assets/locking wheel.png',
    //     title: 'Locking wheel nut removal sockets',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Main Line + Repair Spare',
    //     subtitle3: 'GT876778887876546',
    //   },
    //   {
    //     image: '/assets/deep socket.png',
    //     title: 'Deep Socket',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Main Line + Repair Spare',
    //     subtitle3: 'GT8767788883376546',
    //   },
    //   {
    //     image: '/assets/bit socket.png',
    //     title: 'Bit Socket',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Main Line + Repair Spare',
    //     subtitle3: 'GT87677887776546',
    //   },
    //   {
    //     image: '/assets/locking wheel.png',
    //     title: 'Locking wheel nut removal sockets',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Main Line + Repair Spare',
    //     subtitle3: 'GT876778887876546',
    //   },
    //   {
    //     image: '/assets/deep socket.png',
    //     title: 'Deep Socket',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Main Line + Repair Spare',
    //     subtitle3: 'GT8767788883376546',
    //   },
    //   {
    //     image: '/assets/locking wheel.png',
    //     title: 'Locking wheel nut removal sockets',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Main Line + Repair Spare',
    //     subtitle3: 'GT876778887876546',
    //   },
    //   {
    //     image: '/assets/bit socket.png',
    //     title: 'Bit Socket',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Main Line + Repair Spare',
    //     subtitle3: 'GT87677887776546',
    //   },
    //   {
    //     image: '/assets/locking wheel.png',
    //     title: 'Locking wheel nut removal sockets',
    //     subtitle1: 'Accessories',
    //     subtitle2: 'Main Line + Repair Spare',
    //     subtitle3: 'GT876778887876546',
    //   }
    // ];


  }


  ngOnInit(): void {
    // @ts-ignore

    this.placeorderservice.getallProducts().subscribe(
      // @ts-ignore
      data => {
        this.productmaster = data;
        // console.log(this.productmaster)
      }
    )

  }

  addtoCart() {

    // @ts-ignore
    this.placeorderservice.saveplaceorderdata(this.productmaster)

  }
}

//
// @GetMapping("/joined_data")                                //JOINED DATA OUTPUT OF TWO TABLES
// private List<ProductResponse> joinData(Integer prod_category_id){
//   return entityDataRepo.joinData(prod_category_id);
//
//
// @Query( "select new com.project.test.Dto.ProductResponse(p.prod_name, e.code, p.description) from EntityData e join ProductMaster p on p.prod_category_id = e.entity_data_id")
// public List<ProductResponse> joinData(Integer prod_category_id);
