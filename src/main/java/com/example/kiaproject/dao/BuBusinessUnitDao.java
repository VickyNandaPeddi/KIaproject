package com.example.kiaproject.dao;

import com.example.kiaproject.entity.BuBusinessUnitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BuBusinessUnitDao extends JpaRepository<BuBusinessUnitEntity, Integer> {

    BuBusinessUnitEntity findBuBusinessUnitEntityByUserTypeId(int id);
}
