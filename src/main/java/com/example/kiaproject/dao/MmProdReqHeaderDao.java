package com.example.kiaproject.dao;

import com.example.kiaproject.entity.MmProdReqHeaderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MmProdReqHeaderDao extends JpaRepository<MmProdReqHeaderEntity,Integer> {
}
