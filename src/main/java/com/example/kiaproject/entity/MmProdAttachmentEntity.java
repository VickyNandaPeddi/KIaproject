package com.example.kiaproject.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "mm_prod_attachment")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class MmProdAttachmentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PROD_ATTACHMENT_ID")
    private int prodAttachmentId;
      
    @Column(name = "PROD_MASTER_ID")
    private Integer prodMasterId;
      
    @Column(name = "ATTACH_CGY_TYPE")
    private String attachCgyType;
      
    @Column(name = "DOC_NAME")
    private String docName;
      
    @Column(name = "DOC_PATH")
    private String docPath;
      
    @Column(name = "CREATED_BY")
    private int createdBy;
      
    @Column(name = "CREATED_ON")
    private Timestamp createdOn;
      
    @Column(name = "UPDATED_BY")
    private Integer updatedBy;
      
    @Column(name = "UPDATED_ON")
    private Timestamp updatedOn;


}
