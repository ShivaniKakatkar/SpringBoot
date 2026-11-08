package com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycle {
    public static void main(String[] args) {
        AbstractApplicationContext contex = new ClassPathXmlApplicationContext("lifecycleconfig.xml");
        contex.registerShutdownHook();

        Address s1 = (Address) contex.getBean("s1");
        System.out.println(s1);

        City s2 = (City)contex.getBean("s2");
        System.out.println(s2);

        Annotations s3 = (Annotations) contex.getBean("s3");
        System.out.println(s3);
    }
}
