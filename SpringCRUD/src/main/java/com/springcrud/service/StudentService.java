package com.springcrud.service;

import com.springcrud.entity.Student;
import com.springcrud.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq){
        studentReq.setDeleted(false);
        System.out.println("Inside student service");
        Student studentResp = studentRepository.save(studentReq);
        System.out.println("Exiting student service");
        return studentResp;
    }

    public Student getStudent(Long id){
        Optional<Student> studentResp = studentRepository.findByIdAndDeletedIsFalse(id);

        if (studentResp.isPresent()){
            return studentResp.get();
        }
        return null;
    }

    public List<Student> getAllStudent(){
        List<Student> studentResp = studentRepository.findByAndDeletedIsFalse();

        if (studentResp.isEmpty()){
            return null;
        }
        return studentResp;
    }

    public Student updateStudent(Long id, Student studentReq){
        Optional<Student> existingStudent = studentRepository.findByIdAndDeletedIsFalse(id);
        if (existingStudent.isEmpty()){
            return null;
        }

        Student studentToSave = existingStudent.get();

        studentToSave.setName(studentReq.getName());
        studentToSave.setRno(studentReq.getRno());
        studentToSave.setSubject(studentReq.getSubject());
        studentToSave.setAge(studentReq.getAge());
        studentToSave.setEmail(studentReq.getEmail());
        studentToSave.setDeleted(false);

        return studentRepository.save(studentToSave);

    }

    public Boolean deleteStudentRecord(Long id){
        Boolean isStudent = studentRepository.existsById(id);
        if (!isStudent) return false;

        studentRepository.deleteById(id);
        return true;
    }

    public Boolean deleteStudentSoftly(Long id){
        Optional<Student> existingStudent = studentRepository.findByIdAndDeletedIsFalse(id);

        if (existingStudent.isEmpty()){
            return false;
        }
        Student studentToSave = existingStudent.get();
        studentToSave.setDeleted(true);
        studentRepository.save(studentToSave);
        return true;
    }
}
