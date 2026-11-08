package com.constinjec;

import java.util.*;

public class Collections {
    private List<String> hobbies;
    private Set<String>  skills;
    private Map<String, String> courses;
    private Properties prop;
    private Person p;


    public Collections(List<String> hobbies, Set<String> skills, Map<String, String> courses, Properties prop, Person p) {
        this.hobbies = hobbies;
        this.skills = skills;
        this.courses = courses;
        this.prop = prop;
        this.p = p;
    }

    @Override
    public String toString() {
        return "Collections{" +
                "\nhobbies=" + this.hobbies +
                ", \nskills=" + this.skills +
                ", \ncourses=" + this.courses +
                ", \nproperties=" + this.prop +
                ", \nperson=" + this.p.cert +
                '}';
    }
}
