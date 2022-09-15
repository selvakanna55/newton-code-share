package com.learn.newton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studRep;


    List<Student> getAllStudents() {
        return (List<Student>) studRep.findAll();
    }

    public Student getStudentByRollNo(Integer roll) {
        Optional<Student> op = studRep.findById(roll);
        return op.orElse(null);
    }

    public void addStudent(Student stud) {
        studRep.save(stud);
    }

    public void updateStudent(int rollNo, Student stud) {
        studRep.save(stud);
    }

    public void deleteStudentByRollNo(Integer rollNo) {
        studRep.deleteById(rollNo);
    }
}
