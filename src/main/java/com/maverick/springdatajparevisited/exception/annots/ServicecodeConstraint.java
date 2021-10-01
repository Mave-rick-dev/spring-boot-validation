package com.maverick.springdatajparevisited.exception.annots;

import com.maverick.springdatajparevisited.exception.validator.ServiceCodeValidator;

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
@Constraint(validatedBy = ServiceCodeValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface ServicecodeConstraint   {
    String message() default "Not a valid carrier!!";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
