package com.jurin_n.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { Employee2RoleRankValidation.class })
@Documented
public @interface CheckEmployee2Rank {
    String message() default "{com.jurin_n.validation.CheckEmployee2Rank}";

    Class<?>[]groups() default {};

    Class<? extends Payload>[]payload() default {};

    CheckMode value() default CheckMode.DEFAULT;
}
