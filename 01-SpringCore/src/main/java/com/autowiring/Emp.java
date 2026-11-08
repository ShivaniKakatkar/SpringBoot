package com.autowiring;



public class Emp {
    private Address address;

    public Emp(Address address) {
        System.out.println("Constructor of emp");
        this.address = address;
    }

    public Emp() {
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
