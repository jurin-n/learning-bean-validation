package com.jurin_n.validation;

@CheckEmployee2Rank(value = CheckMode.HARD)
public class Employee2 {
    private Role role;
    private int rank;

    public Employee2(Role role, int rank) {
        super();
        this.role = role;
        this.rank = rank;
    }

    public Role getRole() {
        return role;
    }

    public int getRank() {
        return rank;
    }
}
