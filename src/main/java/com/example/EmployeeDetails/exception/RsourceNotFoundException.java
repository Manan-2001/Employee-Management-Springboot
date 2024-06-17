package com.example.EmployeeDetails.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RsourceNotFoundException extends RuntimeException{
    public RsourceNotFoundException(String msg){
        super(msg);
    }
}
