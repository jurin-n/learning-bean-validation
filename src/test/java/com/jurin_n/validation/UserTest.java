package com.jurin_n.validation;

import static org.junit.Assert.*;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    private ValidatorFactory vf;
    private Validator validator;

    @Before
    public void setUp() {
        vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
    }

    @Test
    public void test() {
        User user = new User();
        user.setPassword("p001");

        Set<ConstraintViolation<User>> vRet = validator.validate(user);
        vRet.stream().forEach(r -> { System.out.println(r.getMessage() + "[" + r.getInvalidValue().toString() + "]");});
    }
}
