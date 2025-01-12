package vn.tayjava.util;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PhoneValidator.class)
@Target( { ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)

public @interface PhoneNumber{

    String message() default "Invalid phone number"; // message default
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
