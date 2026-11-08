package com.reference;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
        A aref = (A) context.getBean("aref");
        System.out.println(aref);
        System.out.println(aref.getX());
        System.out.println(aref.getOb().getY());
//        B bref = (B) context.getBean("bref");
//        System.out.println(bref);
    }
}
