package com.maverick.springdatajparevisited.exception.validator;

import com.maverick.springdatajparevisited.dto.TopUpReqDTO;
import com.maverick.springdatajparevisited.exception.annots.ServicecodeConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Project spring-boot-validation
 * @Author mave on 9/30/21
 */
public class ServiceCodeValidator implements ConstraintValidator<ServicecodeConstraint, String> {
    @Override
    public boolean isValid(String serviceCode, ConstraintValidatorContext context) {

        return serviceCode.equals("NP-RTP-NCELL")|
                serviceCode.equals("NP-RTP-NTPRE")|
                serviceCode.equals("NP-RTP-NTPRE")|
                serviceCode.equals("NP-RTP-NTPOST")|
                serviceCode.equals("NP-RTP-NTPRECDMA")|
                serviceCode.equals("NP-RTP-NTPOSTCDMA")|
                serviceCode.equals("NP-RTP-NTPSTN")|
                serviceCode.equals("NP-RTP-NTADSL-UL")|
                serviceCode.equals("NP-RTP-SMARTCELL")|
                serviceCode.equals("NP-RTP-NTFTTH")|
                serviceCode.equals("NP-RTP-NTWIMAX");
    }


    @Override
    public void initialize(ServicecodeConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }
}
