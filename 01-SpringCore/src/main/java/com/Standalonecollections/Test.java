package com.Standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standaloneconfig.xml");
        Person p1 = context.getBean("p1",Person.class);
        System.out.println(p1);
        System.out.println(p1.getFees().getClass().getName());
        System.out.println(p1.getProperties().getClass().getName());
    }
}
