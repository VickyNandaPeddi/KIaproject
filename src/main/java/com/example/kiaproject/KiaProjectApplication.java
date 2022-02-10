package com.example.kiaproject;

import com.example.kiaproject.dao.EntityDataDao;
import com.example.kiaproject.dao.MmProdReqDetailsDao;
import com.example.kiaproject.entity.EntityDataEntity;
import com.example.kiaproject.entity.MmProductMasterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class KiaProjectApplication implements CommandLineRunner {
  @Autowired
  EntityDataDao entityDataDao;

  public static void main(String[] args) {
    SpringApplication.run(KiaProjectApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
   

  }
}
