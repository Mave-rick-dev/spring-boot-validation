package com.maverick.springdatajparevisited.controller;

import com.maverick.springdatajparevisited.dto.PasswordReqDTO;
import com.maverick.springdatajparevisited.service.PasswordChangeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @Project spring-boot-validation
 * @Author mave on 9/29/21
 */
@RestController
@RequestMapping(value = "/password")
@RequiredArgsConstructor
public class PasswordController {

    private final PasswordChangeService passwordChangeService;

    @PostMapping(value = "/change")
    public ResponseEntity<?> changePassword(@Valid @RequestBody PasswordReqDTO passwordRequestDTO){
        return ResponseEntity.ok(passwordChangeService.changePassword(passwordRequestDTO));
    }
}
