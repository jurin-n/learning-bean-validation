package com.jurin_n.validation;

public class User {
    @CheckPassword
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }
}
