package com.maverick.springdatajparevisited.exception;

import com.maverick.springdatajparevisited.exception.annots.ContactNumberConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Project spring-boot-validation
 * @Author mave on 9/29/21
 */
public class ContactNumberValidator implements ConstraintValidator<ContactNumberConstraint, String> {
    @Override
    public void initialize(ContactNumberConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String contactField, ConstraintValidatorContext context) {
        return contactField != null &&
                contactField.startsWith("98450") &&
                (contactField.length() == 10);
    }
}
