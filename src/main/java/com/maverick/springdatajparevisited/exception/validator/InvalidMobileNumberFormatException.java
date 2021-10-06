package com.maverick.springdatajparevisited.exception.validator;

import javax.validation.ValidationException;

/**
 * @Project spring-boot-validation
 * @Author mave on 10/5/21
 */
public class InvalidMobileNumberFormatException extends ValidationException {

    public InvalidMobileNumberFormatException(String message){super(message);}

    public InvalidMobileNumberFormatException(String message, Throwable cause){
        super(message);
    }
}
