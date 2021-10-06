package com.maverick.springdatajparevisited.exception;

import com.maverick.springdatajparevisited.exception.validator.InvalidMobileNumberFormatException;
import com.maverick.springdatajparevisited.exception.validator.UnsupportedAmountExcepiton;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
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
        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
            errors.add(error.getField() + ": " + error.getDefaultMessage());
        }

        for (ObjectError error : ex.getBindingResult().getGlobalErrors()) {
            System.out.println(ex.getBindingResult().getGlobalErrors());
            errors.add(error.getObjectName() + ": " + error.getDefaultMessage());
        }
        ErrorAttributes errorAttributes = new ErrorAttributes(
                status,
                ex.getLocalizedMessage(),
                errors
        );
        return handleExceptionInternal(ex, errorAttributes, headers, errorAttributes.getStatus(), request);
    }

    @ExceptionHandler({ValidationException.class})
    public final ResponseEntity<Object> handleValidationExceptions(
            ValidationException ex) {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        List<String> errors = new ArrayList<>();
        //ex.getCause();

        ErrorAttributes errorAttributes = new ErrorAttributes(
                status,
                ex.getMessage(),
                errors
        );

        return new ResponseEntity(errorAttributes, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<Object> handleServiceCodeNotFound(
            final RuntimeException ex) {
        final List<String> errors = new ArrayList<>();
        final HttpStatus status = HttpStatus.BAD_REQUEST;
        errors.add(ex.getMessage());
        final ErrorAttributes errorAttributes = new ErrorAttributes(
                status,
                ex.getMessage()
        );
        return new ResponseEntity<Object>(errorAttributes, new HttpHeaders(), status);
    }

}
