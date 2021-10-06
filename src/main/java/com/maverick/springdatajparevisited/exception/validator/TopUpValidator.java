package com.maverick.springdatajparevisited.exception.validator;

import com.maverick.springdatajparevisited.constant.MobileNoFormat;
import com.maverick.springdatajparevisited.constant.ServiceCode;
import com.maverick.springdatajparevisited.constant.SupportedAmount;
import com.maverick.springdatajparevisited.dto.TopUpReqDTO;
import com.maverick.springdatajparevisited.exception.ServiceCodeNotFoundException;
import com.maverick.springdatajparevisited.exception.annots.TopUpConstraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
/**
 * @Project spring-boot-validation
 * @Author mave on 9/30/21
 */
public class TopUpValidator implements ConstraintValidator<TopUpConstraint, TopUpReqDTO> {


    @Override
    public void initialize(TopUpConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(TopUpReqDTO topUpReqDTO, ConstraintValidatorContext context) {
        boolean isValidated = false;

        if(topUpReqDTO.getServicecode() == null
            || topUpReqDTO.getMobileno() == null
            || topUpReqDTO.getAmount() == null){
            isValidated = false;
        }else {
            switch (topUpReqDTO.getServicecode()) {
                case ServiceCode.NCELL:
                    if (topUpReqDTO.getMobileno().matches(MobileNoFormat.NCELL)) {
                        if (SupportedAmount.NCELL.test(topUpReqDTO.getAmount())) {
                            isValidated = true;
                        }
                    }//else return NumberFormatException

                    break;
                case ServiceCode.NT_PREPAID:
                    if (topUpReqDTO.getMobileno().matches(MobileNoFormat.NT_PREPAID)) {
                        for (Double amount : SupportedAmount.NT_PREPAID) {
                            if (topUpReqDTO.getAmount().compareTo(amount) == 0) {
                                isValidated = true;
                            }
                        }
                    }
                    break;
                case ServiceCode.NT_POSTPAID:
                    if (topUpReqDTO.getMobileno().matches(MobileNoFormat.NT_POSTPAID)) {
                        if (SupportedAmount.NT_POSTPAID.test(topUpReqDTO.getAmount())) {
                            isValidated = true;
                        }
                    }
                    break;
                case ServiceCode.NT_CDMA_POSTPAID:
                    if (topUpReqDTO.getMobileno().matches(MobileNoFormat.NT_CDMA_POSTPAID)) {
                        for (Double amount : SupportedAmount.NT_CDMA_POSTPAID) {
                            if (topUpReqDTO.getAmount().compareTo(amount) == 0) {
                                isValidated = true;
                            }
                        }
                    }
                    break;
                case ServiceCode.NT_CDMA_PREPAID:
                    if (topUpReqDTO.getMobileno().matches(MobileNoFormat.NT_CDMA_PREPAID)) {
                        if (SupportedAmount.NT_CDMA_PREPAID.test(topUpReqDTO.getAmount())) {
                            isValidated = true;
                        }
                    }
                    break;
                case ServiceCode.NT_LANDLINE:
                    if (topUpReqDTO.getMobileno().matches(MobileNoFormat.NT_LANDLINE)) {
                        if (SupportedAmount.NT_LANDLINE.test(topUpReqDTO.getAmount())) {
                            isValidated = true;
                        }
                    }
                    break;
                case ServiceCode.NT_ADSL_UNLIMITED:
                case ServiceCode.NT_ADSL_VOLUME:
                     if (topUpReqDTO.getMobileno().matches(MobileNoFormat.NT_ADSL_UNLIMITED)) {
                         if (SupportedAmount.NT_ADSL_UNLIMITED.test(topUpReqDTO.getAmount())) {
                             isValidated = true;
                        }
                    }
                    break;
                case ServiceCode.SMARTCELL:
                    if (topUpReqDTO.getMobileno().matches(MobileNoFormat.SMARTCELL)) {
                        for (Double amount : SupportedAmount.SMARTCELL) {
                            if (topUpReqDTO.getAmount().compareTo(amount) == 0) {
                                isValidated = true;
                            }
                        }
                    }
                    break;
                case ServiceCode.NT_FIBER:
                     if (topUpReqDTO.getMobileno().matches(MobileNoFormat.NT_FIBER)) {
                         if (SupportedAmount.NT_FIBER.test(topUpReqDTO.getAmount())) {
                             isValidated = true;
                        }
                    }
                    break;
                case ServiceCode.NT_WIMAX:
                     if (topUpReqDTO.getMobileno().matches(MobileNoFormat.NT_WIMAX)) {
                        if (SupportedAmount.NT_WIMAX.test(topUpReqDTO.getAmount())) {
                            isValidated = true;
                        }
                    }
                    break;
                default:
                    //isValidated=true;
                    throw new ServiceCodeNotFoundException("Invalid Service Code!!");

            }
        }
        return isValidated;
    }
}
