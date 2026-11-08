package com.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
    public String name;
    public List<Integer> phones;
    public Set<String> addresses;
    public Map<String, String> courses;
    public Properties prop1;

    public Emp(String name, List<Integer> phones, Set<String> addresses, Map<String, String> courses, Properties prop1) {
        this.name = name;
        this.phones = phones;
        this.addresses = addresses;
        this.courses = courses;
        this.prop1 = prop1;
    }

//    public Emp() {
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public List<Integer> getPhones() {
        return phones;
    }

//    public void setPhones(List<Integer> phones) {
//        this.phones = phones;
//    }

    public Set<String> getAddresses() {
        return addresses;
    }

//    public void setAddresses(Set<String> addresses) {
//        this.addresses = addresses;
//    }

    public Map<String, String> getCourses() {
        return courses;
    }

//    public void setCourses(Map<String, String> courses) {
//        this.courses = courses;
//    }
    public Properties getProp1() {
        return prop1;
    }

//    public void setProp1(Properties prop1) {
//        this.prop1 = prop1;
//    }


    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                ", addresses=" + addresses +
                ", courses=" + courses +
                ", prop1=" + prop1 +
                '}';
    }
}
