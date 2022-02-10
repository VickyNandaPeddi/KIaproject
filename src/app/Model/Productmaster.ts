export class Productmaster {
  public prodMasterId: number;
  public prodCategoryId: number;
  public prodTypeId: number;
  public prodCode: string;
  public prodName: string;
  public partNbr: string;
  public description: string;
  public length: string;
  public diaMm: string;
  public driveSize: string;
  public uom: number;
  public minQty: number;
  public maxQty: number;
  public totQty: number;
  public isActive: string;
  public imgLocation: string;
  public imgName: string;
  public createdBy: number;
  public createdOn: Date;
  public updatedBy: number;
  public updatedOn: Date;


  constructor(prodMasterId: number, prodCategoryId: number, prodTypeId: number, prodCode: string, prodName: string, partNbr: string, description: string, length: string, diaMm: string, driveSize: string, uom: number, minQty: number, maxQty: number, totQty: number, isActive: string, imgLocation: string, imgName: string, createdBy: number, createdOn: Date, updatedBy: number, updatedOn: Date) {
    this.prodMasterId = prodMasterId;
    this.prodCategoryId = prodCategoryId;
    this.prodTypeId = prodTypeId;
    this.prodCode = prodCode;
    this.prodName = prodName;
    this.partNbr = partNbr;
    this.description = description;
    this.length = length;
    this.diaMm = diaMm;
    this.driveSize = driveSize;
    this.uom = uom;
    this.minQty = minQty;
    this.maxQty = maxQty;
    this.totQty = totQty;
    this.isActive = isActive;
    this.imgLocation = imgLocation;
    this.imgName = imgName;
    this.createdBy = createdBy;
    this.createdOn = createdOn;
    this.updatedBy = updatedBy;
    this.updatedOn = updatedOn;
  }
}
