package com.example.demo.student;

import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>();

    StudentController() {
        students.add(new Student("Newton", 1, 99.9));
        students.add(new Student("Abcd", 4, 90.5));
        students.add(new Student("MNOp", 7, 90.5));
    }

    @PostMapping("/student")
    Student createStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }


    @GetMapping("/students")
    List<Student> getStudents() {
        return students;
    }

    @GetMapping("/student/{rollNo}")
    Student getStudentByRollNo(@PathVariable int rollNo) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).rollNo == rollNo) {
                return students.get(i);
            }
        }
        return null;
    }

    @PutMapping("/student")
    boolean updateStudent(@RequestBody Student student) {
        boolean isUpdated = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).rollNo == student.rollNo) {
                students.set(i, student);
                isUpdated = true;
                break;
            }
        }
        return isUpdated;
    }

    //    @RequestMapping(method = RequestMethod.DELETE, value = "/students/{rollNo}")
    @DeleteMapping("/student/{rollNo}")
    boolean deleteStudent(@PathVariable int rollNo) {
        boolean isDelete = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).rollNo == rollNo) {
                students.remove(i);
                isDelete = true;
                break;
            }
        }
        return isDelete;
    }

}
