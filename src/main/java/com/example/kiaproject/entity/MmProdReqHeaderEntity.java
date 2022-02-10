package com.example.kiaproject.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "mm_prod_req_header")
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MmProdReqHeaderEntity {
    //    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PROD_REQ_HDR_ID")
    private int prodReqHdrId;
    @NotEmpty(message = "no empty")
    @Column(name = "REQ_NBR")
    private String reqNbr;

    @Column(name = "REQ_DATE")
    private Timestamp reqDate;

    @Column(name = "REQ_DEPT")
    private Integer reqDept;

    @Column(name = "REQ_SECTION")
    private Integer reqSection;

    @Column(name = "REQ_LINE")
    private Integer reqLine;

    @Column(name = "REQUESTED_BY")
    private Integer requestedBy;

    @Column(name = "ORDER_TYPE")
    private String orderType;

    @Column(name = "PRCS_STATUS_ID")
    private Integer prcsStatusId;

    @Column(name = "STATUS_ID")
    private Integer statusId;

    @Column(name = "SIC_COMMENTS")
    private String sicComments;

    @Column(name = "AIC_COMMENTS")
    private String aicComments;

    @Column(name = "ISSUED_BY")
    private Integer issuedBy;

    @Column(name = "ISSUED_DATE")
    private Timestamp issuedDate;

    @Column(name = "CREATED_BY")
    private int createdBy;

    @Column(name = "CREATED_ON")
    private Timestamp createdOn;

    @Column(name = "UPDATED_BY")
    private Integer updatedBy;

    @Column(name = "UPDATED_ON")
    private Timestamp updatedOn;
    @OneToMany(mappedBy = "prodReqHdrId", targetEntity = MmProdReqDetailsEntity.class)
    private Collection<MmProdReqDetailsEntity> mmProdReqDetailsByProdReqHdrId;
//    @ManyToOne
//    @JoinColumn(name = "REQ_DEPT", referencedColumnName = "ID", insertable = false, updatable = false)
//    private BuBusinessUnitEntity buBusinessUnitByReqDept;
//    @ManyToOne
//    @JoinColumn(name = "REQ_SECTION", referencedColumnName = "ID", insertable = false, updatable = false)
//    private BuBusinessUnitEntity buBusinessUnitByReqSection;
//    @ManyToOne
//    @JoinColumn(name = "REQ_LINE", referencedColumnName = "ENTITY_DATA_ID", insertable = false, updatable = false)
//    private EntityDataEntity entityDataByReqLine;
//    @ManyToOne
//    @JoinColumn(name = "PRCS_STATUS_ID", referencedColumnName = "ENTITY_DATA_ID", insertable = false, updatable = false)
//    private EntityDataEntity entityDataByPrcsStatusId;
//    @ManyToOne
//    @JoinColumn(name = "STATUS_ID", referencedColumnName = "ENTITY_DATA_ID", insertable = false, updatable = false)
//    private EntityDataEntity entityDataByStatusId;


}
