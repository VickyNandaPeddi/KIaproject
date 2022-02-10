package com.example.kiaproject.service;

import com.example.kiaproject.dao.EntityDataDao;
import com.example.kiaproject.entity.EntityDataEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EntityDataService {
    @Autowired
    public EntityDataDao entityDataDao;

    public EntityDataEntity saveEntityDataEntity(EntityDataEntity entityDataEntity) {
        EntityDataEntity entityData = entityDataDao.save(entityDataEntity);
        return entityData;
    }

    public EntityDataEntity findEntityDataEntitybyID(int id) {
        EntityDataEntity entityDataEntity = entityDataDao.findById(id).get();
        return entityDataEntity;
    }

    public List<EntityDataEntity> findAllEntityDataEntitys() {
        List<EntityDataEntity> entityDataEntities = entityDataDao.findAll();
        return entityDataEntities;
    }

    public List<EntityDataEntity> saveAllEntityDataEntitys(List<EntityDataEntity> entityDataEntities) {
        List<EntityDataEntity> savedentityDataEntities = entityDataDao.saveAll(entityDataEntities);
        return savedentityDataEntities;

    }
}
