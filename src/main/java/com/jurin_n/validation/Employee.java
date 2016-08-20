package com.jurin_n.validation;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Employee {
    @Min(1)
    private int number;

    @NotNull
    private String name;

    public Employee(int number, String name) {
        super();
        this.number = number;
        this.name = name;
    }
}
