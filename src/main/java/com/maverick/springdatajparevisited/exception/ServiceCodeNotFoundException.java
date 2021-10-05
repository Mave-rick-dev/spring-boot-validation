package com.maverick.springdatajparevisited.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Project spring-boot-validation
 * @Author mave on 10/4/21
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ServiceCodeNotFoundException extends RuntimeException{
    public ServiceCodeNotFoundException(String message){super(message);}

    public ServiceCodeNotFoundException(String message, Throwable cause){
        super(message);
    }
}
