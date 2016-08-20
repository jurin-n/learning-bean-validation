package com.jurin_n.validation.subclass;

import javax.validation.constraints.NotNull;

public class Customer {
    @NotNull
    protected String name;
    @NotNull
    protected String address;

    public Customer(String name, String address) {
        super();
        this.name = name;
        this.address = address;
    }
}
