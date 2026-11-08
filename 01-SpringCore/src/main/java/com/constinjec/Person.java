package com.constinjec;

import java.util.*;

public class Person {
    private String name;
    private int personId;
    Certify cert;
    private List<String> list;


    public Person(String name, int personId,Certify cert, List<String> list) {
        System.out.println("Constructor");
        this.name = name;
        this.personId = personId;
        this.cert = cert;
        this.list = list;
    }

    @Override
    public String toString() {

        return this.name + ":" + this.personId +"{ "+this.cert.name +" | "+ this.list+" }";
    }
}
