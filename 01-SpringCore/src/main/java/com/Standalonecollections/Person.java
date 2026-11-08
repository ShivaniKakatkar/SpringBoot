package com.Standalonecollections;



import java.util.*;

public class Person {
    private List<String> name;
    private Map<String,Integer> fees;
    private Properties properties;


    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public Map<String, Integer> getFees() {
        return fees;
    }

    public void setFees(Map<String, Integer> fees) {
        this.fees = fees;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", fees=" + fees +
                ", properties=" + properties +
                '}';
    }
}
