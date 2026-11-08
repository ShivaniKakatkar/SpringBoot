package com.annotations;

import org.springframework.stereotype.Component;


public class Students {
        private Teachers teach;

    public Students(Teachers teach) {
        this.teach = teach;
    }

    public void study(){
            System.out.println("I am studying Spring core");
        }

    public Teachers getTeach() {
        this.teach.teach();
        return teach;
    }

    public void setTeach(Teachers teach) {
        this.teach = teach;
    }
}
