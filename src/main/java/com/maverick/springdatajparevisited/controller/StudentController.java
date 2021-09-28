package com.maverick.springdatajparevisited.controller;

import com.maverick.springdatajparevisited.dto.StudentRequestDTO;
import com.maverick.springdatajparevisited.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping(value = "/list")
    public ResponseEntity<?> getStudentList(@Valid @RequestBody StudentRequestDTO studentRequestDTO) {
        /**
         * Spring, by default, bootstraps the argument annotated with @Valid with
         * Hibernate Validator (JSR 380 implementation)
         * And on failure to validate, MethodArgumentNotValidException is thrown
         */
        return ResponseEntity.ok(studentService.getStudentList(studentRequestDTO));
    }
}


