package com.maverick.springdatajparevisited.exception.annots;

import com.maverick.springdatajparevisited.exception.ContactNumberValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @Project spring-boot-validation
 * @Author mave on 9/29/21
 */
@Documented
@Constraint(validatedBy = ContactNumberValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ContactNumberConstraint {
    String message() default "Not a NTC carrier. Enter new number again!!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
