package com.maverick.springdatajparevisited.exception.validator;

import com.maverick.springdatajparevisited.dto.TopUpReqDTO;
import com.maverick.springdatajparevisited.exception.annots.TopUpMobileConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Project spring-boot-validation
 * @Author mave on 9/30/21
 */
public class TopUpMobileValidator implements ConstraintValidator<TopUpMobileConstraint, String> {
    @Override
    public boolean isValid(String mobileNum, ConstraintValidatorContext context) {

        TopUpReqDTO topUpReqDTO = new TopUpReqDTO();
        System.out.println(topUpReqDTO.getServicecode());
        /*
        Mobile No Format
        return mobileNum.startsWith("980")
                || mobileNum.startsWith("981")
                || mobileNum.startsWith("982")
                && mobileNum.length() == 10
         */

        return  (mobileNum.length() == 10)
                && mobileNum.startsWith("980")
                || mobileNum.startsWith("981")
                || mobileNum.startsWith("982");
    }

    @Override
    public void initialize(TopUpMobileConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }
}
