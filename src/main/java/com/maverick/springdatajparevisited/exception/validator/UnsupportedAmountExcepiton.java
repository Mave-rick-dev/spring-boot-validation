package com.maverick.springdatajparevisited.exception.validator;

import javax.validation.ValidationException;

/**
 * @Project spring-boot-validation
 * @Author mave on 10/5/21
 */
public class UnsupportedAmountExcepiton extends ValidationException {
    public UnsupportedAmountExcepiton(String message){super(message);}

    public UnsupportedAmountExcepiton(String message, Throwable cause){
        super(message);
    }
}
