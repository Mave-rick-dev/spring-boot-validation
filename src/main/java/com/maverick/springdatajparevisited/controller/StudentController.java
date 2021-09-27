package com.maverick.springdatajparevisited.controller;

import com.maverick.springdatajparevisited.dto.StudentRequestDTO;
import com.maverick.springdatajparevisited.dto.StudentResponseDTO;
import com.maverick.springdatajparevisited.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping(value = "/list")
    public List<StudentResponseDTO> getStudentList(@Valid @RequestBody StudentRequestDTO studentRequestDTO){
        return studentService.getStudentList(studentRequestDTO);
    }
}
