package com.example.kiaproject.entity;

import lombok.*;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.PastOrPresent;
import java.sql.Timestamp;

@Entity
@Table(name = "mm_product_master")
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MmProductMasterEntity {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "PROD_MASTER_ID")
  //@NotNull(message = "prodCategoryId should Not be empty")
  private int prodMasterId;
  // prodCategoryId should not be null or empty
  // prodCategoryId should have at least 2 characters

  //@NotNull(message = "prodCategoryId should should Not be empty")
  @Column(name = "PROD_CATEGORY_ID")
  private Integer prodCategoryId;
  // prodCategoryId should not be null or empty
  // prodCategoryId should have at least 2 characters

  //@NotNull(message = "prodTypeId should should Not be empty")
  @Column(name = "PROD_TYPE_ID")
  private Integer prodTypeId;

  //@NumberFormat
  //@NotNull(message = "prodCode should should Not be empty")
  @Column(name = "PROD_CODE")
  private String prodCode;

  //@NotNull(message = "prodName should should Not be empty")
  @Column(name = "PROD_NAME")
  private String prodName;

  //@NumberFormat
  //@NotNull(message = "partNbr should should Not be empty")
  @Column(name = "PART_NBR")
  private String partNbr;

  //@NotNull(message = "description should should Not be empty")
  @Column(name = "DESCRIPTION")
  private String description;

  //@NumberFormat
  //@NotNull(message = "length should should Not be empty")
  @Column(name = "LENGTH")
  private String length;

  //@NotNull(message = "diaMm  should should Not be empty")
  //@NumberFormat
  @Column(name = "DIA_MM")
  private String diaMm;

  //@NumberFormat
  //@NotNull(message = "driveSize  should should Not be empty")
  @Column(name = "DRIVE_SIZE")
  private String driveSize;

  //@NumberFormat
  //@NotNull(message = "uom  should should Not be empty")
  @Column(name = "UOM")
  private Integer uom;

  //@NumberFormat
  //@NotNull(message = "minQty  should should Not be empty")
  @Column(name = "MIN_QTY")
  private Integer minQty;

  //@NumberFormat
  //@NotNull(message = "maxQty  should should Not be empty")
  @Column(name = "MAX_QTY")
  private Integer maxQty;

  //@NumberFormat
  //@NotNull(message = "totQty should should Not be empty")
  @Column(name = "TOT_QTY")
  private Integer totQty;

  //@NotNull(message = "isActive  should should Not be empty")
  @Column(name = "IS_ACTIVE")
  private String isActive;

  //@NotNull(message = "imgLocation  should should Not be empty")
  @Column(name = "IMG_LOCATION")
  private String imgLocation;

  //@NotNull(message = "imgName  should should Not be empty")
  @Column(name = "IMG_NAME")
  private String imgName;

  //@NotNull(message = "createdBy  should should Not be empty")
  @Column(name = "CREATED_BY")
  private int createdBy;

  @Column(name = "CREATED_ON")
  private Timestamp createdOn;

  //@NotNull(message = "updatedBy  should should Not be empty")
  @Column(name = "UPDATED_BY")
  private Integer updatedBy;

  //@NotNull(message = "updatedOn should should Not be empty")
  //@PastOrPresent
  @Column(name = "UPDATED_ON")
  private Timestamp updatedOn;
  //	@OneToMany(mappedBy = "prodMasterId", targetEntity = MmProdAttachmentEntity.class)
//	private Collection<MmProdAttachmentEntity> mmProdAttachmentsByProdMasterId;
//	@OneToMany(mappedBy = "prodMasterId", targetEntity = MmProdForecastEntity.class)
//	private Collection<MmProdForecastEntity> mmProdForecastsByProdMasterId;
//	@OneToMany(mappedBy = "prodMasterId", targetEntity = MmProdReqDetailsEntity.class)
//	private Collection<MmProdReqDetailsEntity> mmProdReqDetailsByProdMasterId;
//  @ManyToOne(targetEntity = EntityDataEntity.class)
//  @JoinColumn(name = "PROD_CATEGORY_ID", referencedColumnName = "ENTITY_DATA_ID", insertable = false, updatable = false)
//  private EntityDataEntity entityDataByProdCategoryId;
//  @ManyToOne
//  @JoinColumn(name = "PROD_TYPE_ID", referencedColumnName = "ENTITY_DATA_ID", insertable = false, updatable = false)
//  private EntityDataEntity entityDataByProdTypeId;
//  @ManyToOne
//  @JoinColumn(name = "UOM", referencedColumnName = "ENTITY_DATA_ID", insertable = false, updatable = false)
//  private EntityDataEntity entityDataByUom;

}
