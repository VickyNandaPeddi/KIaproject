export interface Orders {
  id?: number;
  item?: string;
  category?: string;
  type?: string;
  length?: string;
  dia?: string;
  drive?: string;
  quantity?: number;
}

//
//
//[02:33 pm] Sharooq Mainuddin Shah
//@GetMapping("/joined_data")                                //JOINED DATA OUTPUT OF TWO TABLES
//private List<ProductResponse> joinData(Integer prod_category_id){
//  return entityDataRepo.joinData(prod_category_id);
//
//[02:33 pm] Sharooq Mainuddin Shah
//@Query( "select new com.project.test.Dto.ProductResponse(p.prod_name, e.code, p.description) from EntityData e join ProductMaster p on p.prod_category_id = e.entity_data_id")
//public List<ProductResponse> joinData(Integer prod_category_id);
//
