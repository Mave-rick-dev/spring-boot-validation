package com.maverick.springdatajparevisited.exception.validator;

import com.maverick.springdatajparevisited.exception.annots.TopUpAmountConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Project spring-boot-validation
 * @Author mave on 9/30/21
 */
public class TopUpAmountValidator implements ConstraintValidator<TopUpAmountConstraint, Double> {
    @Override
    public boolean isValid(Double amount, ConstraintValidatorContext context) {
        /**
         * Supported Amount:
         * return amount>=10 && amount>=5000;
         */
        return amount>=10 && amount<=5000;
    }

    @Override
    public void initialize(TopUpAmountConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }
}
