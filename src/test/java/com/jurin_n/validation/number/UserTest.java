package com.jurin_n.validation.number;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class UserTest {
    private ValidatorFactory vf;
    private Validator validator;

    @Before
    public void setUp() {
        vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
    }

    @Test
    public void Ageアノテーション検証() {
        User user = new User("test taro", 151, 9, 9);
        validate(user);
    }

    @Test
    public void 範囲内のためエラーにならない() {
        User user = new User("test taro", 5);
        validate(user);

        User user2 = new User("test taro", 10);
        assertThat(validate(user2).size(), is(0));
    }

    @Test
    public void 範囲外のためエラー() {
        User user = new User("test taro", 4);
        validate(user);

        User user2 = new User("test taro", 11);
        assertThat(validate(user2).size(), is(not(0)));
    }

    private Set<ConstraintViolation<User>> validate(User user) {
        Set<ConstraintViolation<User>> vRet = validator.validate(user);
        vRet.stream().forEach(r -> {
            System.out.println(r.getMessage() + "["
                    + r.getInvalidValue().toString() + "]");
        });
        return vRet;
    }
}