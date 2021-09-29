package com.maverick.springdatajparevisited.serviceImpl;

import com.maverick.springdatajparevisited.dto.PasswordReqDTO;
import com.maverick.springdatajparevisited.service.PasswordChangeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project spring-boot-validation
 * @Author mave on 9/29/21
 */
@Service
public class PasswordChangeServiceImpl implements PasswordChangeService {
    @Override
    public List<String> changePassword(PasswordReqDTO passwordRequestDTO) {
        return List.of(
                passwordRequestDTO.getNewPwd(),
                passwordRequestDTO.getOldPwd(),
                passwordRequestDTO.getReEnteredPwd()
        );
    }
}
