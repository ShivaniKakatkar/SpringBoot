package com.springmvc.service;

import com.springmvc.entity.Student;
import com.springmvc.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq){
        return studentRepository.save(studentReq);
    }
    public Student getStudent(Long id){
        return studentRepository.findById(id);
    }
    public List<Student> getAllStudent(){
        return studentRepository.FindAll();
    }
}
