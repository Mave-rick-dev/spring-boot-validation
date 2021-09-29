package com.maverick.springdatajparevisited.dto;

import com.maverick.springdatajparevisited.exception.annots.NewPasswordConstraint;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @Project spring-boot-validation
 * @Author mave on 9/29/21
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@NewPasswordConstraint
public class PasswordReqDTO {
    @NotNull
    @NotBlank
    private String oldPwd;
    @NotNull
    @NotBlank
    private String newPwd;
    @NotNull
    @NotBlank
    private String reEnteredPwd;
}
