package com.jurin_n.validation.subclass;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Before;
import org.junit.Test;

public class CorporateCustomerValidationTest {
    private ValidatorFactory vf;
    private Validator validator;

    @Before
    public void setUp() {
        vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
    }

    @Test
    public void test() {
        CorporateCustomer customer = new CorporateCustomer("テスト　太郎",
                "Tokyo,Japan.", 12345);
        Set<ConstraintViolation<CorporateCustomer>> vRet = validator
                .validate(customer);
        assertThat(vRet.size(), is(0));
    }

    @Test
    public void test2() {
        CorporateCustomer customer = new CorporateCustomer("テスト　太郎", null,
                12345);
        Set<ConstraintViolation<CorporateCustomer>> vRet = validator
                .validate(customer);
        assertThat(vRet.size(), is(1));
    }

    @Test
    public void test3() {
        CorporateCustomer customer = new CorporateCustomer(null, null, 0);
        Set<ConstraintViolation<CorporateCustomer>> vRet = validator
                .validate(customer);
        assertThat(vRet.size(), is(3));
    }

    @Test
    public void test4() {
        CorporateCustomer customer = new CorporateCustomer(
                "---------1---------2---------31", "Tokyo,Japan", 12345);
        Set<ConstraintViolation<CorporateCustomer>> vRet = validator
                .validate(customer);
        assertThat(vRet.size(), is(0));
    }
}
