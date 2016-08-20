package com.jurin_n.validation.number;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;

//import org.hibernate.validator.constraints.Range;

public class User {
    private String name;
    @Age
    private int age;
    // @Min(5)
    // @Max(10)
    @DecimalMin("5")
    @DecimalMax("10")
    private int loginCount;
    @Range(min = "5", max = "10")
    private int loginCount2;

    public User(String name, int loginCount) {
        super();
        this.name = name;
        this.loginCount = loginCount;
    }

    public User(String name, int age, int loginCount, int loginCount2) {
        super();
        this.name = name;
        this.age = age;
        this.loginCount = loginCount;
        this.loginCount2 = loginCount2;
    }
}
