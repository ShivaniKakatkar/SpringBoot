package com.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
//        PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);
//        paymentGateway.setType("Paytm");
//        paymentGateway.setRetryCount(3);


    }

}
