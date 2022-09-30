package com.dev.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    Student getStudentByRollNo(Integer roll) {
        return studentRepository.findById(roll).get();
    }

    boolean createStudent(Student student) {
        studentRepository.save(student);
        return true;
    }

    boolean updateStudent(Student student) {
        studentRepository.save(student);
        return true;
    }

    boolean deleteStudent(Integer id) {
        studentRepository.deleteById(id);
        return true;
    }


}
