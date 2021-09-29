package com.maverick.springdatajparevisited.service;

import com.maverick.springdatajparevisited.dto.PasswordReqDTO;

import java.util.List;

/**
 * @Project spring-boot-validation
 * @Author mave on 9/29/21
 */
public interface PasswordChangeService {
    List<String> changePassword(PasswordReqDTO passwordRequestDTO);
}
