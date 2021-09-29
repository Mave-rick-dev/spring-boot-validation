package com.maverick.springdatajparevisited.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class HandlerController extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex,
            HttpHeaders headers,
            HttpStatus status,
            WebRequest request) {

        List<String> errors = new ArrayList<String>();
        for(FieldError error:  ex.getBindingResult().getFieldErrors()){
            errors.add(error.getField() + ": " + error.getDefaultMessage());
        }

        for(ObjectError error: ex.getBindingResult().getGlobalErrors()){
            System.out.println(ex.getBindingResult().getGlobalErrors());
            errors.add(error.getObjectName() + ": " + error.getDefaultMessage());
        }
        ErrorAttributes errorAttributes = new ErrorAttributes(
                status,
                ex.getLocalizedMessage(),
                errors
        );
        System.out.println(status);
        return handleExceptionInternal(ex ,errorAttributes, headers, errorAttributes.getStatus(), request);
    }

  /*  @ExceptionHandler(ErrorAttributes.class)
    public ResponseEntity<String> handleEmptyInput(ErrorAttributes emptyInputException){
        return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
    }*/

    /*@ExceptionHandler({ConstraintViolationException.class})
    public Map<String, String> handleInputValidation(MethodArgumentNotValidException methodArgumentNotValidException){
        Map<String, String> errors = new HashMap<>();
          methodArgumentNotValidException.getBindingResult().getAllErrors().forEach((error)->{
            String fieldName = ((FieldError)error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName,errorMessage);
         });
        return errors;
    }*/
}
