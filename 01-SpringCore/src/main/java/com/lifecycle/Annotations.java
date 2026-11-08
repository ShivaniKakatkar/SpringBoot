package com.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Annotations {
    private String subject;

    public Annotations(String subject) {
        this.subject = subject;
    }

    public Annotations() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Annotations{" +
                "subject='" + subject + '\'' +
                '}';
    }

    @PostConstruct
    public void start(){
        System.out.println("Starting Annotations");
    }

    @PreDestroy
    public void end(){
        System.out.println("Ending Annotations");
    }
}
