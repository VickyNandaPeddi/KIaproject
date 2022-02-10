export class Shoppingitem {

  public productmasterid: number;
  public productcatogery: string;
  public producttype: string;
  public productcode: string;
  public productname: string;
  public length: string;
  public dia: string;
  public drivesize: string;
  public imagesize: string;


  constructor(productmasterid: number, productcatogery: string, producttype: string, productcode: string, productname: string, length: string, dia: string, drivesize: string, imagesize: string) {
    this.productmasterid = productmasterid;
    this.productcatogery = productcatogery;
    this.producttype = producttype;
    this.productcode = productcode;
    this.productname = productname;
    this.length = length;
    this.dia = dia;
    this.drivesize = drivesize;
    this.imagesize = imagesize;
  }
}
