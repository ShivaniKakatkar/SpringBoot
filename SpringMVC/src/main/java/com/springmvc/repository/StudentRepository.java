package com.springmvc.repository;

import com.springmvc.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepository {
    private Map<Long, Student> studentDB;

    public StudentRepository() {
        studentDB = new HashMap<>();
    }

    public Student save(Student studentReq){
        Student studentResp = studentDB.put(studentReq.getId(), studentReq);
        return studentResp;
    }

    public Student findById(Long id){
        return studentDB.get(id);
    }
    public List<Student> FindAll(){
        return new ArrayList<>(studentDB.values());
    }


}
