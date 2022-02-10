package com.example.kiaproject.controller;

import com.example.kiaproject.dao.EntityDataDao;
import com.example.kiaproject.entity.EntityDataEntity;
import com.example.kiaproject.entity.MmProductMasterEntity;
import com.example.kiaproject.service.MmProductMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/mmproductmasterentity")

public class MMProductMasterController {
  @Autowired
  public MmProductMasterService mmProductMasterService;
  @Autowired
  EntityDataDao entityDataDao;

  @GetMapping("/mmproductmaster/{id}")
  public ResponseEntity<?> findAllMMProductEntitys(@PathVariable("id") int id) {
    MmProductMasterEntity mmProductMAsterEntity = mmProductMasterService.findOneMMProductMAsterEntity(id);
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(mmProductMAsterEntity);
  }

  @PostMapping("/mmproductmaster")
  public ResponseEntity<MmProductMasterEntity> saveMmProductMasterEntity(
    @RequestBody MmProductMasterEntity MmProductMasterEntity) {
    MmProductMasterEntity mmproductmaster = mmProductMasterService.saveMmProductMasterEntity(MmProductMasterEntity);

    return ResponseEntity.status(HttpStatus.ACCEPTED).body(mmproductmaster);

  }

  //this method to  display list of details to place order
  @GetMapping("/mmproductmaster")
  public ResponseEntity<?> findallMmProductMasterEntitys() {
    List<MmProductMasterEntity> MmProductMasterEntitys = mmProductMasterService.findAllMmProductMasterEntity();
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(MmProductMasterEntitys);
  }

  @PostMapping("/mmproductmasterall")
  public ResponseEntity<?> saveMmProductMasterEntityAll(
    @RequestBody List<MmProductMasterEntity> MmProductMasterEntity) {
    List<MmProductMasterEntity> mmproductMasterentitys = mmProductMasterService
      .saveAllMmProductMasterEntitys(MmProductMasterEntity);
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(mmproductMasterentitys);

  }

//  @GetMapping("/en")
//  public ResponseEntity<?> findallEntitybasedonentitytype() {
//    List<EntityDataEntity> entityDataEntitybycatogery = entityDataDao.findByEntityType("product_category");
//    List<EntityDataEntity> entityDataEntitybytype = entityDataDao.findByEntityType("product_type");
//    List<MmProductMasterEntity> entity = new ArrayList<MmProductMasterEntity>();
//
//
//    for (int i=1;i<entityDataEntitybycatogery.size()-1;i++){
//      System.out.println(entityDataEntitybycatogery.get(i));
//    }
//
//
//
//
//    return ResponseEntity.status(HttpStatus.ACCEPTED).body(entity);
//
//
//  }
}
