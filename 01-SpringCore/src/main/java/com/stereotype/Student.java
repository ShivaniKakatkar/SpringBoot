package com.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("s1")
@Scope("prototype")
// Scope can be Singleton
public class Student {
        @Value("123")
        private int studentId;

        @Value("Shivani")
        private String studentName;

        @Value("#{temp}")
        private List<String> courses;

        @Value("#{ T(java.lang.Math).sqrt(144) }")
        private String x;

        @Value("#{ T(java.lang.Math).E }")
        private String y;

        @Value("#{ new java.lang.String('Shivani Kakatkar') }")
        private String name;

    public Student(int studentId, String studentName, List<String> courses, String x, String name) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courses = courses;
        this.x = x;
        this.name = name;
    }

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public String getX(){
        return x;
    }

    public void setX(String x){
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", courses=" + courses +
                ", x='" + x + '\'' +
                ", y='" + y + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
