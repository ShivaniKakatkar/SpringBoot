package com.annotations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.annotations")
public class JavaConfig {

    @Bean("t1")
    public Teachers teachers(){
        Teachers t = new Teachers();
        return t;
    }


    @Bean("s1")
    public Students getStudents(){
        Students students = new Students(teachers());
        return students;
    }
}
