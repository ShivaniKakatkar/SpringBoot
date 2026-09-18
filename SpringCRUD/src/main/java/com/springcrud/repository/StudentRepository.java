package com.springcrud.repository;

import com.springcrud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

//    public Student saveStudent(Student studentReq){
//        // Save to DB
//        System.out.println("Inside student repository");
//        System.out.println("Exiting student repository");
//        Student s1 = new Student();
//        s1.setName("Shivani");
//        s1.setAge(20);
//        s1.setEmail("Shivani@gmail.com");
//        s1.setRno(137);
//        s1.setSubject("Mathematics");
//        return s1;
//    }

    Optional<Student> findByIdAndDeletedIsFalse(Long id);

    List<Student> findByAndDeletedIsFalse();
}
