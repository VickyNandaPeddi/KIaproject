package com.example.kiaproject.controller;

import com.example.kiaproject.dao.EntityDataDao;
import com.example.kiaproject.entity.EntityDataEntity;
import com.example.kiaproject.service.EntityDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entitydataentity")
public class EntityDataController {
  @Autowired
  EntityDataService entityDataService;
  @Autowired
  EntityDataDao entityDataDao;

  @PostMapping("/entitydata")
  public ResponseEntity<EntityDataEntity> saveEntityDataEntity(@RequestBody EntityDataEntity entityDataEntity) {
    EntityDataEntity entityData = entityDataService.saveEntityDataEntity(entityDataEntity);
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(entityData);

  }

  @GetMapping("/entitydata")
  public ResponseEntity<List<EntityDataEntity>> findallEntityDataEntitys() {
    List<EntityDataEntity> entityDataEntitys = entityDataService.findAllEntityDataEntitys();
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(entityDataEntitys);
  }

  @PostMapping("/entitydataall")
  public ResponseEntity<?> saveEntityDataEntityAll(@RequestBody List<EntityDataEntity> entityDataEntity) {
    List<EntityDataEntity> entityDataEntities = entityDataService.saveAllEntityDataEntitys(entityDataEntity);
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(entityDataEntities);

  }


}
