package com.maverick.springdatajparevisited.service;


import com.maverick.springdatajparevisited.dto.StudentRequestDTO;
import com.maverick.springdatajparevisited.dto.StudentResponseDTO;

import java.util.List;

public interface StudentService {

    List<StudentResponseDTO> getStudentList(StudentRequestDTO studentRequestDTO);
}
