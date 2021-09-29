package com.maverick.springdatajparevisited.exception.validator;

import com.maverick.springdatajparevisited.dto.PasswordReqDTO;
import com.maverick.springdatajparevisited.dto.StudentReqDTO;
import com.maverick.springdatajparevisited.exception.annots.NewPasswordConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Project spring-boot-validation
 * @Author mave on 9/29/21
 */
public class NewPasswordValidator implements ConstraintValidator<NewPasswordConstraint, PasswordReqDTO> {

    @Override
    public void initialize(NewPasswordConstraint newPasswordConstraint) {
        ConstraintValidator.super.initialize(newPasswordConstraint);
    }

    @Override
    public boolean isValid(PasswordReqDTO passwordReqDTO, ConstraintValidatorContext context) {
        return  passwordReqDTO.getNewPwd().equals(passwordReqDTO.getReEnteredPwd());
    }
}
