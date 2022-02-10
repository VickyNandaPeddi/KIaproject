package com.example.kiaproject.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "bu_business_unit")
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BuBusinessUnitEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
       
    @Column(name = "CODE")
    private String code;
       
    @Column(name = "NAME")
    private String name;
       
    @Column(name = "DESCRIPTION")
    private String description;
       
    @Column(name = "PARENT_ID")
    private Integer parentId;
       
    @Column(name = "BU_TYPE_ID")
    private Integer buTypeId;
       
    @Column(name = "USER_TYPE_ID")
    private Integer userTypeId;
       
    @Column(name = "IS_ACTIVE")
    private Byte isActive;
       
    @Column(name = "CREATED_BY")
    private Integer createdBy;
       
    @Column(name = "CREATED_ON")
    private Timestamp createdOn;
       
    @Column(name = "UPDATED_BY")
    private Integer updatedBy;
       
    @Column(name = "UPDATED_ON")
    private Timestamp updatedOn;
       
    @Column(name = "APPROVAL_STATUS_ID")
    private Integer approvalStatusId;
       
    @Column(name = "COMMENTS")
    private String comments;
       
    @Column(name = "GROUP_EMAIL_ID")
    private String groupEmailId;
       
    @Column(name = "SHORT_NAME")
    private String shortName;
       
    @Column(name = "WORKING_CODE")
    private String workingCode;



}
