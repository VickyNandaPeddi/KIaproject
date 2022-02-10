package com.example.kiaproject.service;

import com.example.kiaproject.dao.MmProdReqHeaderDao;
import com.example.kiaproject.entity.MmProdReqDetailsEntity;
import com.example.kiaproject.entity.MmProdReqHeaderEntity;
import com.example.kiaproject.exception.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MmProdReqHeaderService {
    @Autowired
    public MmProdReqHeaderDao mmProdReqHeaderDao;

    @Autowired
    public MmProdReqDetailsService mmProdReqDetailsService;

    public List<MmProdReqDetailsEntity> findAllMmProdReqHeaderwithdetails(int id) {
        List<MmProdReqDetailsEntity> requestheaderID = mmProdReqDetailsService.findMMProductRequestDetailsEntitybyProductRequestheaderID(id);
        return requestheaderID;
    }

    public List<MmProdReqHeaderEntity> findAllMmProdReqHeaderEntity() {
        List<MmProdReqHeaderEntity> productMasterEntities = mmProdReqHeaderDao.findAll();
        return productMasterEntities;
    }

    public String deleteOneMmProdReqHeaderEntity(int id) {
        mmProdReqHeaderDao.deleteById(id);
        return "Deleted Mmproduct request Header of id  :" + id;


    }

    public MmProdReqHeaderEntity findOneMmProdReqHeaderEntity(int id) {
        MmProdReqHeaderEntity MmProdReqHeaderEntity = mmProdReqHeaderDao.findById(id).get();
        return MmProdReqHeaderEntity;

    }

    public MmProdReqHeaderEntity saveMmProdReqHeaderEntity(MmProdReqHeaderEntity MmProdReqHeaderEntity) {
        System.out.println("MMproduct request header id " + MmProdReqHeaderEntity.getProdReqHdrId());

        List<MmProdReqDetailsEntity> productrequestdetailsbyProductrequestheaderid =
                mmProdReqDetailsService.findMMProductRequestDetailsEntitybyProductRequestheaderID(MmProdReqHeaderEntity.getProdReqHdrId());

        for (MmProdReqDetailsEntity mmproudctrequestdetails : productrequestdetailsbyProductrequestheaderid) {
            if (mmproudctrequestdetails.getProdReqHdrId() == MmProdReqHeaderEntity.getProdReqHdrId()) {
                MmProdReqHeaderEntity.setMmProdReqDetailsByProdReqHdrId(productrequestdetailsbyProductrequestheaderid);
            }
        }
        //setting the list of prodreqdetails to productheader id


        MmProdReqHeaderEntity savedmmProductrequestHeader = mmProdReqHeaderDao.save(MmProdReqHeaderEntity);


        if (savedmmProductrequestHeader == null) {
            throw new CustomException("MM product master  must not be empty");
        }
        return savedmmProductrequestHeader;
    }

    public List<MmProdReqHeaderEntity> findAllMmProdReqHeaderEntitys() {

        List<MmProdReqHeaderEntity> mmProdReqHeaderEntitys = mmProdReqHeaderDao.findAll();
        if (mmProdReqHeaderEntitys.isEmpty() && mmProdReqHeaderEntitys == null) {
            throw new RuntimeException("MMproduct MAster IS empty");
        }
        return mmProdReqHeaderEntitys;

    }

    public List<MmProdReqHeaderEntity> saveAllMmProdReqHeaderEntitys(List<MmProdReqHeaderEntity> MmProdReqHeaderEntity) {
        List<MmProdReqHeaderEntity> savedMmProdReqHeaderEntitys = mmProdReqHeaderDao.saveAll(MmProdReqHeaderEntity);
        return savedMmProdReqHeaderEntitys;
    }
}
