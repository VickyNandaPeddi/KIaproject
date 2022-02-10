package com.example.kiaproject.service;

import com.example.kiaproject.dao.MmProdReqDetailsDao;
import com.example.kiaproject.entity.MmProdReqDetailsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MmProdReqDetailsService {
    @Autowired
    public MmProdReqDetailsDao mmProdReqDetailsDao;

    public List<MmProdReqDetailsEntity> findAllMmProdReqDetailsEntity() {
        List<MmProdReqDetailsEntity> productMasterEntities = null;


        productMasterEntities = mmProdReqDetailsDao.findAll();
        if (productMasterEntities.isEmpty()) {
            return productMasterEntities;
        }


        return productMasterEntities;
    }

    public MmProdReqDetailsEntity findOneMmProdReqDetailsEntity(int id) {
        MmProdReqDetailsEntity MmProdReqDetailsEntity = mmProdReqDetailsDao.findById(id).get();
        if (MmProdReqDetailsEntity == null) {
            throw new RuntimeException("No  Details Found");

        }
        return MmProdReqDetailsEntity;

    }

    public MmProdReqDetailsEntity saveMmProdReqDetailsEntity(MmProdReqDetailsEntity MmProdReqDetailsEntity) throws Exception {
        MmProdReqDetailsEntity savedmmProductrequestHeader = null;
        try {


            savedmmProductrequestHeader = mmProdReqDetailsDao.save(MmProdReqDetailsEntity);
            if (savedmmProductrequestHeader == null) {
                throw new RuntimeException("MM product master contains no data");
            }
        } catch (Exception e) {
            throw new Exception("unable to save," + e.getMessage());
        }
        return savedmmProductrequestHeader;
    }

    public List<MmProdReqDetailsEntity> findAllMmProdReqDetailsEntitys() {

        List<MmProdReqDetailsEntity> MmProdReqDetailsEntitys = mmProdReqDetailsDao.findAll();
        if (MmProdReqDetailsEntitys.isEmpty() && MmProdReqDetailsEntitys == null) {
            throw new RuntimeException("MMproduct MAster IS empty");
        }
        return MmProdReqDetailsEntitys;

    }

    public List<MmProdReqDetailsEntity> saveAllMmProdReqDetailsEntitys(
            List<MmProdReqDetailsEntity> MmProdReqDetailsEntity) {
        List<MmProdReqDetailsEntity> savedMmProdReqDetailsEntitys = mmProdReqDetailsDao.saveAll(MmProdReqDetailsEntity);
        return savedMmProdReqDetailsEntitys;
    }


    public List<MmProdReqDetailsEntity> findMMProductRequestDetailsEntitybyProductRequestheaderID(int id) {
        return mmProdReqDetailsDao.findMmProdReqDetailsEntityByProdMasterId(id);
    }
}
