package com.example.kiaproject.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "mm_prod_forecast")

@Data

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class MmProdForecastEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PROD_FORECAST_ID")
    private int prodForecastId;
        
    @Column(name = "YEAR")
    private String year;
        
    @Column(name = "MONTH")
    private String month;
        
    @Column(name = "LINE_ID")
    private Integer lineId;
        
    @Column(name = "PROD_MASTER_ID")
    private Integer prodMasterId;
        
    @Column(name = "QUANTITY")
    private String quantity;
        
    @Column(name = "CREATED_BY")
    private int createdBy;
        
    @Column(name = "CREATED_ON")
    private Timestamp createdOn;
        
    @Column(name = "UPDATED_BY")
    private Integer updatedBy;
        
    @Column(name = "UPDATED_ON")
    private Timestamp updatedOn;
//    @ManyToOne
//    @JoinColumn(name = "LINE_ID", referencedColumnName = "ENTITY_DATA_ID", insertable=false, updatable=false)
//    private EntityDataEntity entityDataByLineId;

   
}
