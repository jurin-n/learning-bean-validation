package com.jurin_n.validation;

import static org.junit.Assert.*;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Before;
import org.junit.Test;

public class Employee2Test {
    private ValidatorFactory vf;
    private Validator validator;

    @Before
    public void setUp() {
        vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
    }

    @Test
    public void test() {
        Employee2 employee = new Employee2(Role.NONE, 3);

        Set<ConstraintViolation<Employee2>> vRet = validator.validate(employee);

        vRet.stream().forEach(e -> System.out.println(e.getMessage()));
    }
}
