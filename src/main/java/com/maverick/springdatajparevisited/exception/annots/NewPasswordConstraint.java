package com.maverick.springdatajparevisited.exception.annots;

import com.maverick.springdatajparevisited.exception.validator.NewPasswordValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Project spring-boot-validation
 * @Author mave on 9/29/21
 */
@Target(ElementType.TYPE)
@Constraint(validatedBy = NewPasswordValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface NewPasswordConstraint {
    String message() default "Re-entered password not matching!!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
