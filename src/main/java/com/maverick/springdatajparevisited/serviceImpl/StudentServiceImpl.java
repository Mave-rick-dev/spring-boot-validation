package com.maverick.springdatajparevisited.serviceImpl;

import com.maverick.springdatajparevisited.dto.StudentRequestDTO;
import com.maverick.springdatajparevisited.dto.StudentResponseDTO;
import com.maverick.springdatajparevisited.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public List<StudentResponseDTO> getStudentList(StudentRequestDTO studentRequestDTO) {
        List<StudentResponseDTO> studentResponseDTOList = List.of(
                new StudentResponseDTO(
                        "Om Narayan Singh",
                        "Kamalpokhari")
        );
        return studentResponseDTOList;
    }
}
