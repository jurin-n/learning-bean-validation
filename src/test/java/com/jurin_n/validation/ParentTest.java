package com.jurin_n.validation;

import static org.junit.Assert.fail;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Before;
import org.junit.Test;

public class ParentTest {
    private ValidatorFactory vf;
    private Validator validator;

    @Before
    public void setUp() {
        vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
    }

    @Test
    public void test() {
        Parent parent = new Parent();
        parent.addChild(new Child(10));
        parent.addChild(new Child(20));
        parent.addChild(new Child(30));

        Set<ConstraintViolation<Parent>> vRet = validator.validate(parent);
        vRet.stream().forEach(r -> {
            System.out.println(r.getMessage() + "["
                    + r.getInvalidValue().toString() + "]");
        });
    }

}
