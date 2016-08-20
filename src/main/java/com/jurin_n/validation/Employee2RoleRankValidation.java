package com.jurin_n.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Employee2RoleRankValidation
        implements ConstraintValidator<CheckEmployee2Rank, Employee2> {

    private CheckMode mode;

    @Override
    public void initialize(CheckEmployee2Rank rank) {
        mode = rank.value();
    }

    @Override
    public boolean isValid(Employee2 emp, ConstraintValidatorContext context) {
        switch (mode) {
            case HARD:
                return !((emp.getRank() == 3) && (emp.getRole().equals(Role.NONE)));
            case SOFT:
                return true;
            default:
                return !((emp.getRank() == 5) && (emp.getRole().equals(Role.NONE)));

        }
    }
}
