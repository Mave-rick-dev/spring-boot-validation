package com.maverick.springdatajparevisited.exception.validator;

import com.maverick.springdatajparevisited.constant.ServiceCode;
import com.maverick.springdatajparevisited.constant.SupportedAmount;
import com.maverick.springdatajparevisited.dto.TopUpReqDTO;
import com.maverick.springdatajparevisited.exception.annots.TopUpConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

/**
 * @Project spring-boot-validation
 * @Author mave on 9/30/21
 */
public class TopUpValidator implements ConstraintValidator<TopUpConstraint, TopUpReqDTO> {
    boolean isValid = false;
    @Override
    public void initialize(TopUpConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(TopUpReqDTO topUpReqDTO, ConstraintValidatorContext context) {

        switch(topUpReqDTO.getServicecode()){
            case ServiceCode.NCELL:
                if(topUpReqDTO.getMobileno().length() == 10
                        && topUpReqDTO.getMobileno().startsWith("980")
                        || topUpReqDTO.getMobileno().startsWith("981")
                        || topUpReqDTO.getMobileno().startsWith("982")){
                     if(topUpReqDTO.getAmount()>=10.0 && topUpReqDTO.getAmount()<=5000.0){
                        isValid = true;
                    }
                }
                break;
            case ServiceCode.NT_PREPAID:
                if(topUpReqDTO.getMobileno().length() == 10
                        && topUpReqDTO.getMobileno().startsWith("984")
                        || topUpReqDTO.getMobileno().startsWith("986")){
                    for (Double amnt: SupportedAmount.NT_PREPAID
                    ) {
                        if(topUpReqDTO.getAmount() == amnt){
                            isValid = true;
                        }
                    }
                }
        }


          if(topUpReqDTO.getServicecode().equals("NP-RTP-NTPRE")){
            if(topUpReqDTO.getMobileno().length() == 10
                    && topUpReqDTO.getMobileno().startsWith("980")
                    || topUpReqDTO.getMobileno().startsWith("981")
                    || topUpReqDTO.getMobileno().startsWith("982")){
                if(topUpReqDTO.getAmount() == 10.0
                        && topUpReqDTO.getAmount()==20.0
                        && topUpReqDTO.getAmount()==30.0
                        ){
                    isValid = true;
                }
            }
        }

        /**
         * foreach(String carrier: TelcoServicesENUM){
         *  if(topUpRequestDTO.getServiceCode().equals(carrier)){
         *      //validateNumAmt(number & amount)
         *      @NumberConstraint
         *      String number = topUpRequestDTO.getMobileNo();
         *  }
         * }
         */

        return isValid;
    }
}
