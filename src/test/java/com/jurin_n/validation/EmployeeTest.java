package com.jurin_n.validation;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

    private ValidatorFactory vf;
    private Validator validator;

    @Before
    public void setUp() {
        vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
    }

    @Test
    public void test() {
        Employee employee = new Employee(0, null);

        Set<ConstraintViolation<Employee>> vRet = validator.validate(employee);

        vRet.stream().forEach(e -> System.out.println(e.getMessage()));
    }

}
