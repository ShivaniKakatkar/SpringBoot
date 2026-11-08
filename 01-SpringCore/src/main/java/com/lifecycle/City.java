package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class City implements InitializingBean, DisposableBean {
    private String city;

    public City(String city) {
        this.city = city;
    }

    public City() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "City{" +
                "city='" + city + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init method from City");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy method from City");
    }
}
