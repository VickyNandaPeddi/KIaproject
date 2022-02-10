package com.example.kiaproject.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "user_account")
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserAccountEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
          
    @Column(name = "USER_NAME")
    private String userName;
          
    @Column(name = "PASSWORD")
    private String password;
          
    @Column(name = "BUS_UNIT_ID")
    private Integer busUnitId;
          
    @Column(name = "SECTION_ID")
    private Integer sectionId;
          
    @Column(name = "USER_TYPE_ID")
    private Integer userTypeId;
          
    @Column(name = "LAST_LOGIN_TIME")
    private Timestamp lastLoginTime;
          
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
          
    @Column(name = "DESCRIPTION")
    private String description;
          
    @Column(name = "APPROVAL_STATUS_ID")
    private Integer approvalStatusId;
          
    @Column(name = "COMMENTS")
    private String comments;
          
    @Column(name = "IS_LOCKED")
    private Byte isLocked;
          
    @Column(name = "IT_SUPPORT_NO")
    private String itSupportNo;
//    @OneToMany(mappedBy = "requestedBy")
//    private Collection<MmProdReqHeaderEntity> mmProdReqHeadersById;
//    @OneToMany(mappedBy = "issuedBy")
//    private Collection<MmProdReqHeaderEntity> mmProdReqHeadersById_0;


}
