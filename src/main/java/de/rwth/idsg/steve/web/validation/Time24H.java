package de.rwth.idsg.steve.web.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Sevket Goekay <goekay@dbis.rwth-aachen.de>
 * @since 15.08.2014
 */
@Target(FIELD)
@Retention(RUNTIME)
@Constraint(validatedBy = Time24HValidator.class)
public @interface Time24H {

    String message() default "";

    // Required by validation runtime
    Class<?>[] groups() default {};

    // Required by validation runtime
    Class<? extends Payload>[] payload() default {};
}