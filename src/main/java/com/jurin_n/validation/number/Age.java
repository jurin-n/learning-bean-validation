package com.jurin_n.validation.number;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;

@Documented
@Constraint(validatedBy = {})
@Target({FIELD})
@Retention(RUNTIME)
@ReportAsSingleViolation
@Range(min = "0", max = "150")
public @interface Age {
    String message() default "{com.jurin_n.validation.number.Age.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
