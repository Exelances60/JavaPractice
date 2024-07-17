package com.enes.jobapplication.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ResponseHandler {
    public static <T> ResponseEntity<T> generateResponse(HttpStatus status, String message, T responseObj) {
        Map<String, Object> map = new HashMap<>();
        map.put("status", status.value());
        map.put("message", message);
        map.put("data", responseObj);
        return new ResponseEntity<>((T) map, status);
    }

}
