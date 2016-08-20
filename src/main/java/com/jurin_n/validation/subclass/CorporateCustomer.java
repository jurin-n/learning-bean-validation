package com.jurin_n.validation.subclass;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class CorporateCustomer extends Customer {
    @Min(10)
    private int corporateNumber;

    @Size(min = 0, max = 120)
    private String name;

    public CorporateCustomer(String name, String address, int corporateNumber) {
        super(name, address);
        this.corporateNumber = corporateNumber;
    }
}
