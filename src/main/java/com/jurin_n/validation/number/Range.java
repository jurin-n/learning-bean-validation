package com.jurin_n.validation.number;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.OverridesAttribute;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Documented
@Constraint(validatedBy = { })
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
@DecimalMin("0")
@DecimalMax("9223372036854775807")
//@Min(0)
//@Max(Long.MAX_VALUE)
@ReportAsSingleViolation
public @interface Range {
    @OverridesAttribute(constraint = DecimalMin.class, name = "value") String min() default "0";

    @OverridesAttribute(constraint = DecimalMax.class, name = "value") String max() default "9223372036854775807";

//    @OverridesAttribute(constraint = Min.class, name = "value") long min() default 0;
//
//    @OverridesAttribute(constraint = Max.class, name = "value") long max() default Long.MAX_VALUE;

    String message() default "{com.jurin_n.validation.number.Range.message}";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };

    @Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
    @Retention(RUNTIME)
    @Documented
    public @interface List {
        Range[] value();
    }
}
