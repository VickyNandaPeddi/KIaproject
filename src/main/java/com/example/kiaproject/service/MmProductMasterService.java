package com.example.kiaproject.service;

import com.example.kiaproject.dao.MmProductMasterDao;
import com.example.kiaproject.entity.MmProductMasterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class MmProductMasterService {
  @Autowired
  public MmProductMasterDao mmProductMasterDao;

  public List<MmProductMasterEntity> findAllMmProductMasterEntity() {
    List<MmProductMasterEntity> productMasterEntities = mmProductMasterDao.findAll();

    return productMasterEntities;
  }

  public MmProductMasterEntity findOneMMProductMAsterEntity(int id) {
    MmProductMasterEntity mmProductMasterEntity = mmProductMasterDao.findById(id).get();


    return mmProductMasterEntity;

  }

  public MmProductMasterEntity saveMmProductMasterEntity(MmProductMasterEntity mmProductMasterEntity) {

    MmProductMasterEntity mmProductMaster = mmProductMasterDao.save(mmProductMasterEntity);

    return mmProductMaster;
  }

  public List<MmProductMasterEntity> saveAllMmProductMasterEntitys(
    List<MmProductMasterEntity> mmProductMasterEntity) {
    List<MmProductMasterEntity> savedMmProductMasterEntitys = mmProductMasterDao.saveAll(mmProductMasterEntity);
    return savedMmProductMasterEntitys;
  }
}
