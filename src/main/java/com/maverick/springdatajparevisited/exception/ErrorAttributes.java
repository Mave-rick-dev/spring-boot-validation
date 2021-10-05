package com.maverick.springdatajparevisited.exception;

import lombok.*;
import org.springframework.http.HttpStatus;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ErrorAttributes {
    private HttpStatus status;
    private String message;
    private List<String> errors;


}
