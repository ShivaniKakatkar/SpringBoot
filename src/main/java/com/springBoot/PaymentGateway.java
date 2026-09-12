package com.springBoot;

import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {
    private PaymentProperties paymentProperties;

    public PaymentGateway(PaymentProperties paymentProperties) {
        this.paymentProperties = paymentProperties;
    }

    public String getType(){
        return paymentProperties.getType();
    }

    public int getRetryCount(){
        return paymentProperties.getRetryCount();
    }

    public void print(){
        System.out.println(getType());
        System.out.println(getRetryCount());
    }
}
//    @Value("${paymentGateway.type:RazorPay}")
//    private String type;
//    @Value("${paymentGateway.retry-count}")
//    private int retryCount;

//    public PaymentGateway(@Value("${paymentGateway.type}") String type,
//                          @Value("${paymentGateway.retry-count}") int retryCount) {
//        this.type = type;
//        this.retryCount = retryCount;
//    }