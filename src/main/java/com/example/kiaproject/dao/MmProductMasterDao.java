package com.example.kiaproject.dao;

import com.example.kiaproject.entity.MmProductMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MmProductMasterDao extends JpaRepository<MmProductMasterEntity,Integer> {
}
