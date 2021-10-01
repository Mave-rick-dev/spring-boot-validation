package com.maverick.springdatajparevisited.serviceImpl;

import com.maverick.springdatajparevisited.dto.TopUpReqDTO;
import com.maverick.springdatajparevisited.dto.StudentResDTO;
import com.maverick.springdatajparevisited.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public List<StudentResDTO> getStudentList(TopUpReqDTO studentRequestDTO) {
        List<StudentResDTO> studentResponseDTOList = List.of(
                new StudentResDTO(
                        "Om Narayan Singh",
                        "Kamalpokhari")
        );
        return studentResponseDTOList;
    }
}
