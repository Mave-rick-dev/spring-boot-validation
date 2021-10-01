package com.maverick.springdatajparevisited.exception.annots;

import com.maverick.springdatajparevisited.exception.validator.ServiceCodeValidator;
import com.maverick.springdatajparevisited.exception.validator.TopUpAmountValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Project spring-boot-validation
 * @Author mave on 9/30/21
 */
@Target(ElementType.FIELD)
@Constraint(validatedBy = TopUpAmountValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface TopUpAmountConstraint {
    String message() default "Not a valid amount!!";

    /**
     * Bean validation specification for Spring (boiler-plate codes)
     */
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
