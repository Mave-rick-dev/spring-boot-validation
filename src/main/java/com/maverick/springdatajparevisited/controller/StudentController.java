package com.maverick.springdatajparevisited.controller;

import com.maverick.springdatajparevisited.dto.TopUpReqDTO;
import com.maverick.springdatajparevisited.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@RestController
@RequestMapping(value = "/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping(value = "/list")
    public ResponseEntity<?> getStudentList(@Valid @RequestBody TopUpReqDTO studentRequestDTO) {
        /**
         * Spring, by default, bootstraps the argument annotated with @Valid with
         * Hibernate Validator (JSR 380 implementation)
         * And on failure to validate, MethodArgumentNotValidException is thrown
         */
        return ResponseEntity.ok(studentService.getStudentList(studentRequestDTO));
    }

    /**
     * For path variable|query parameter that are unlike Objects (Integer, String)
     *  are primitive types like int, so we use @Min, @Max
     * Http status = 500; Internal server error, which does not makes sense so we
     *  use @ResponseStatus for 400 status code: Bad request error
     */
    @GetMapping(value = "/list/{id}")
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<?> getStudentById(@PathVariable ("id") @Min(5) int id, @Valid @RequestBody TopUpReqDTO studentRequestDTO) {
        return ResponseEntity.ok(studentService.getStudentList(studentRequestDTO));
    }
}


