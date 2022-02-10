package com.example.kiaproject.controller;

import com.example.kiaproject.controlleradvice.ApiResponse;
import com.example.kiaproject.entity.MmProdReqDetailsEntity;
import com.example.kiaproject.service.MmProdReqDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/mmproductrequestdetalisentity")
public class MmProdReqDetailsController {

    @Autowired
    public MmProdReqDetailsService mmProdReqDetailsService;

    //to get one productrequest header
    @GetMapping("/mmproductrequestdetail/{id}")
    public ResponseEntity<?> findoneProdReqDetailsEntity(@PathVariable("id") int id) {
        MmProdReqDetailsEntity mmProdReqDetailsEntity = mmProdReqDetailsService.findOneMmProdReqDetailsEntity(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(mmProdReqDetailsEntity);
    }

    //to save product request header
    @PostMapping("/mmproductrequestdetail")
    public ResponseEntity<?> saveMmProdReqDetailsEntity(
            @Valid @RequestBody MmProdReqDetailsEntity MmProdReqDetailsEntity, BindingResult result) throws Exception {
        MmProdReqDetailsEntity mmProdReqdetails = mmProdReqDetailsService
                .saveMmProdReqDetailsEntity(MmProdReqDetailsEntity);
        if (mmProdReqdetails != null) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(new ApiResponse(mmProdReqdetails, true, "Saved Product Requestheader Sucessfully", new Timestamp(System.currentTimeMillis())));
        } else {

            return ResponseEntity.status(HttpStatus.ACCEPTED).body(new ApiResponse(false, result.toString()));

        }

    }

    //to get prodcut request details list
    @GetMapping("/mmproductrequestdetails")
    public ResponseEntity<List<MmProdReqDetailsEntity>> findallMmProdReqDetailsEntitys() {
        List<MmProdReqDetailsEntity> MmProdReqDetailsEntitys = mmProdReqDetailsService.findAllMmProdReqDetailsEntitys();
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(MmProdReqDetailsEntitys);
    }

    //to save list of product reqeust header datails
    @PostMapping("/mmproductrequestdetails")
    public ResponseEntity<?> saveMmProdReqDetailsEntityAll(
            @Valid @RequestBody List<MmProdReqDetailsEntity> MmProdReqDetailsEntity, BindingResult result) {
        List<MmProdReqDetailsEntity> MmProdReqDetailsEntitys = mmProdReqDetailsService
                .saveAllMmProdReqDetailsEntitys(MmProdReqDetailsEntity);
        if (MmProdReqDetailsEntitys != null) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(new ApiResponse(MmProdReqDetailsEntitys, true, "Saved Product Requestheader Sucessfully", new Timestamp(System.currentTimeMillis())));
        } else {

            return ResponseEntity.status(HttpStatus.ACCEPTED).body(new ApiResponse(false, "Unable to save Please Check"));

        }
    }


    //to get one productrequest header
    @GetMapping("/mmproductrequestheader/{id}")
    public ResponseEntity<?> findoneProdReqHeaderEntity(@PathVariable("id") int id) {
        List<MmProdReqDetailsEntity> productRequestheaderID = mmProdReqDetailsService.findMMProductRequestDetailsEntitybyProductRequestheaderID(id);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(productRequestheaderID);
    }
}
