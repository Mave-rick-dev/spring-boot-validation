package com.maverick.springdatajparevisited.exception.validator;

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
        return contactField.startsWith("98450") &&
                (contactField.length() == 10);

        /**
         * Service Code
         * return serviceCode.equals("NP-RTP-NCELL");
         */

        /*
        Mobile No Format
        return mobileNum.startsWith("980")
                || mobileNum.startsWith("981")
                || mobileNum.startsWith("982")
                && mobileNum.length() == 10
         */

        /**
         * Supported Amount:
         * return amount>=10 && amount>=5000;
         */
    }
}
