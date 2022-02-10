package com.example.kiaproject.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "entity_data")

@Data

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EntityDataEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ENTITY_DATA_ID")
    private int entityDataId;
     
    @Column(name = "ENTITY_TYPE")
    private String entityType;
     
    @Column(name = "CODE")
    private String code;
     
    @Column(name = "NAME")
    private String name;
     
    @Column(name = "DESCRIPTION")
    private String description;
     
    @Column(name = "CREATED_BY")
    private Integer createdBy;
     
    @Column(name = "CREATED_ON")
    private Timestamp createdOn;
     
    @Column(name = "UPDATED_BY")
    private Integer updatedBy;
     
    @Column(name = "UPDATED_ON")
    private Timestamp updatedOn;
     
    @Column(name = "IS_ACTIVE")
    private Byte isActive;



}
