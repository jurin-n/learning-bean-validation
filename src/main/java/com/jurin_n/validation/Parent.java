package com.jurin_n.validation;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

public class Parent {
    @Valid
    private List<Child> children;

    public Parent() {
        children = new ArrayList<>();
    }

    public void addChild(Child child) {
        children.add(child);
    }
}
