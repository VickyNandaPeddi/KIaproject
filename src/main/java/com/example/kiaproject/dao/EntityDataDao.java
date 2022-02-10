package com.example.kiaproject.dao;

import com.example.kiaproject.entity.EntityDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntityDataDao extends JpaRepository<EntityDataEntity, Integer> {

  public List<EntityDataEntity> findByEntityType(String entitytype);

}

