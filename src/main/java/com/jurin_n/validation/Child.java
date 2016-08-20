package com.jurin_n.validation;

import javax.validation.constraints.Max;

public class Child {
    @Max(10)
    private int val;

    public Child(int val) {
        super();
        this.val = val;
    }
}
