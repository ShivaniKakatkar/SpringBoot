package com.autowiringannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

    @Autowired
    @Qualifier("a2")
    private Address address;


    public Emp(Address address) {
        super();
        System.out.println("Constructor of emp");
        this.address = address;
    }

    public Emp() {
        super();
    }

    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        System.out.println("Setter of emp");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
