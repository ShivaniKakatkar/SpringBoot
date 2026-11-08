package com.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeconfig.xml");
        Student s1 = context.getBean("s1",Student.class);
        System.out.println(s1);
        System.out.println(s1.hashCode());
        Student s2 = context.getBean("s1",Student.class);
        System.out.println(s2.hashCode());
    }
}
