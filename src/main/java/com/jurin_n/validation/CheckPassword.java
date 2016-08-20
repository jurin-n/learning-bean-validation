package com.jurin_n.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@ReportAsSingleViolation
@NotNull
@Size(min = 8, max = 16)
@Pattern(regexp = ".*[!-/]+.*")
@Constraint(validatedBy = {})
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CheckPassword {
    String message() default "{com.jurin_n.validation.CheckPassword}";

    Class<?>[]groups() default {};

    Class<? extends Payload>[]payload() default {};
}
