package com.example.kiaproject.dao;

import com.example.kiaproject.entity.MmProdReqDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MmProdReqDetailsDao extends JpaRepository<MmProdReqDetailsEntity, Integer> {
    public List<MmProdReqDetailsEntity> findMmProdReqDetailsEntityByProdMasterId(int id);

}
