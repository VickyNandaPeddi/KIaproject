package com.example.kiaproject.controller;

import com.example.kiaproject.controlleradvice.ApiResponse;
import com.example.kiaproject.entity.MmProdReqDetailsEntity;
import com.example.kiaproject.entity.MmProdReqHeaderEntity;
import com.example.kiaproject.service.MmProdReqHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.Timestamp;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/MmProdReqHeaderEntity")
public class MmProdReqHeaderController {

  @Autowired
  public MmProdReqHeaderService mmProdReqHeaderService;

  //to  get one product request header entity
  @GetMapping("/mmproductrequestheader/{id}")
  public ResponseEntity<?> findoneProdReqHeaderEntity(@PathVariable("id") int id) {
    MmProdReqHeaderEntity mmProdReqHeaderEntity = mmProdReqHeaderService.findOneMmProdReqHeaderEntity(id);
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(mmProdReqHeaderEntity);
  }

  //to save product request header entity
  @PostMapping("/mmproductrequestheader")
  public ResponseEntity<?> saveMmProdReqHeaderEntity(
    @Valid @RequestBody MmProdReqHeaderEntity MmProdReqHeaderEntity, BindingResult result) {


    MmProdReqHeaderEntity mmProdReqHeader = mmProdReqHeaderService.saveMmProdReqHeaderEntity(MmProdReqHeaderEntity);
    if (mmProdReqHeader != null) {
      return ResponseEntity.status(HttpStatus.ACCEPTED).body(new ApiResponse(mmProdReqHeader, true, "Saved Product Requestheader Sucessfully", new Timestamp(System.currentTimeMillis())));
    } else {

      return ResponseEntity.status(HttpStatus.ACCEPTED).body(new ApiResponse(false, result.getObjectName()));

    }

  }

  //to  get list of productrequest headerentity
  @GetMapping("/mmproductrequestheader")
  public ResponseEntity<?> findallMmProdReqHeaderEntitys() {
    List<MmProdReqHeaderEntity> MmProdReqHeaderEntitys = mmProdReqHeaderService.findAllMmProdReqHeaderEntitys();

    return ResponseEntity.status(HttpStatus.ACCEPTED).body(MmProdReqHeaderEntitys);
  }

  //save list of product requestheader entitys
  @PostMapping("/mmproductrequestheaders")
  public ResponseEntity<?> saveMmProdReqHeaderEntityAll(
    @Valid @RequestBody List<MmProdReqHeaderEntity> MmProdReqHeaderEntity, BindingResult result) {
    List<MmProdReqHeaderEntity> MmProdReqHeaderEntitys = mmProdReqHeaderService
      .saveAllMmProdReqHeaderEntitys(MmProdReqHeaderEntity);
    if (MmProdReqHeaderEntitys != null) {
      return ResponseEntity.status(HttpStatus.ACCEPTED).body(new ApiResponse(true, "Saved Product Requestheader Sucessfully"));
    } else {

      return ResponseEntity.status(HttpStatus.ACCEPTED).body(new ApiResponse(false, "Unable To save Please Check"));

    }

  }

  //to  delete one product request header entity
  @DeleteMapping("/mmproductrequestheader/{id}")
  public ResponseEntity<?> deleteoneProdReqHeaderEntity(@PathVariable("id") int id) {
    String deleteMessage = mmProdReqHeaderService.deleteOneMmProdReqHeaderEntity(id);
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(deleteMessage);
  }

  //to get one prdduvt reqdetails
  @GetMapping("/mmproductrequest/{id}")
  public ResponseEntity<?> findoneProdReqHeaderwithdetails(@PathVariable("id") int id) {
    List<MmProdReqDetailsEntity> headerwithdetails = mmProdReqHeaderService.findAllMmProdReqHeaderwithdetails(id);
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(headerwithdetails);
  }
}
