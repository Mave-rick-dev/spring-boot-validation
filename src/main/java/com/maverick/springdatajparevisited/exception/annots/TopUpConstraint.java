package com.maverick.springdatajparevisited.exception.annots;

import com.maverick.springdatajparevisited.exception.validator.NewPasswordValidator;
import com.maverick.springdatajparevisited.exception.validator.TopUpValidator;

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
@Target(ElementType.TYPE)
@Constraint(validatedBy = TopUpValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface TopUpConstraint {
    String message() default "Invalid Topup Credentials!!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
