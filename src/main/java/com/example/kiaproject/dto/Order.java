package com.example.kiaproject.dto;

import com.example.kiaproject.entity.MmProdReqHeaderEntity;
import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private MmProdReqHeaderEntity mmProdReqHeaderEntity;


}
