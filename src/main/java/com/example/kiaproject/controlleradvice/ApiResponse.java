package com.example.kiaproject.controlleradvice;

import lombok.*;

import java.util.Date;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ApiResponse {
    private Object object;
    private Boolean success;
    private String message;
    private Date timestamp;

    public ApiResponse(boolean b, String s) {
    }

    public ApiResponse(Object object, Boolean success, String message) {
        this.object = object;
        this.success = success;
        this.message = message;
    }

    public ApiResponse(Boolean success, String message, Date timestamp) {
        this.success = success;
        this.message = message;
        this.timestamp = timestamp;
    }
}
