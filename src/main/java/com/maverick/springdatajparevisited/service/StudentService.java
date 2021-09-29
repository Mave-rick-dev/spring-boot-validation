package com.maverick.springdatajparevisited.service;


import com.maverick.springdatajparevisited.dto.StudentReqDTO;
import com.maverick.springdatajparevisited.dto.StudentResDTO;

import java.util.List;

public interface StudentService {

    List<StudentResDTO> getStudentList(StudentReqDTO studentRequestDTO);
}
