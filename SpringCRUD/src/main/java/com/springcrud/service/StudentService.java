package com.springcrud.service;

import com.springcrud.entity.Student;
import com.springcrud.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq){
        System.out.println("Inside student service");
        Student studentResp = studentRepository.save(studentReq);
        System.out.println("Exiting student service");
        return studentResp;
    }
    public Student getStudent(Long id){
        Optional<Student> studentResp = studentRepository.findById(id);
        if (studentResp.isPresent()){
            return studentResp.get();
        }
        return null;
    }
}
