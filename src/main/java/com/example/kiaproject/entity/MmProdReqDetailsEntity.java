package com.example.kiaproject.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "mm_prod_req_details")
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class MmProdReqDetailsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PROD_REQ_DTLS_ID")
    private int prodReqDtlsId;
    //    @NotEmpty(message = "Please provide a name")
    @Column(name = "PROD_REQ_HDR_ID")
    private Integer prodReqHdrId;

    @Column(name = "PROD_MASTER_ID")
    private Integer prodMasterId;

    @Column(name = "ORDERED_QTY")
    private Integer orderedQty;

    @Column(name = "APPRVD_QTY")
    private Integer apprvdQty;

    @Column(name = "UOM_ID")
    private Integer uomId;

    @Column(name = "EXPIRY_DATE")
    private Date expiryDate;

    @Column(name = "STATUS_ID")
    private Integer statusId;

    @Column(name = "CREATED_BY")
    private int createdBy;

    @Column(name = "CREATED_ON")
    private Timestamp createdOn;

    @Column(name = "UPDATED_BY")
    private Integer updatedBy;

    @Column(name = "UPDATED_ON")
    private Timestamp updatedOn;
//    @ManyToOne
//    @JoinColumn(name = "UOM_ID", referencedColumnName = "ENTITY_DATA_ID", insertable=false, updatable=false)
//    private EntityDataEntity entityDataByUomId;
//    @ManyToOne
//    @JoinColumn(name = "STATUS_ID", referencedColumnName = "ENTITY_DATA_ID", insertable=false, updatable=false)
//    private EntityDataEntity entityDataByStatusId;


}
