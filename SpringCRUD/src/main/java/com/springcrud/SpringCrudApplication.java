package com.springcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringCrudApplication {

    public static void main(String[] args) {
//pull request change

        SpringApplication.run(SpringCrudApplication.class, args);
        System.out.println("Hello world");
    }

}
