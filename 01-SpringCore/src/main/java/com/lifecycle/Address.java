package com.lifecycle;

public class Address {
    private String addr;

    public Address(String addr) {
        super();
        this.addr = addr;
    }

    public Address() {
        super();
    }


    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        System.out.println("set method");
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Address[" +
                "addr='" + addr + "'" +
                "]";
    }

    public void init(){
        System.out.println("Init method started");
    }
    public void destroy(){
        System.out.println("destroy method completed");
    }
}
