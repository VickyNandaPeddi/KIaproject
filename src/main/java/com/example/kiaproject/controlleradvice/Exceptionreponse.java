package com.example.kiaproject.controlleradvice;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Exceptionreponse {
    private HttpStatus status;
    private String message;

    public Exceptionreponse(HttpStatus notFound, List<String> details) {
    }
}
