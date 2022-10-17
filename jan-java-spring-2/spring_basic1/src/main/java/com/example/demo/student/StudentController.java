package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    StudentService studentService;


    @PostMapping("/student")
    Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }


    @GetMapping("/students")
    List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/student/{rollNo}")
    Student getStudentByRollNo(@PathVariable int rollNo) {
        return studentService.getStudentByRollNo(rollNo);
    }

    @PutMapping("/student")
    boolean updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    //    @RequestMapping(method = RequestMethod.DELETE, value = "/students/{rollNo}")
    @DeleteMapping("/student/{rollNo}")
    boolean deleteStudent(@PathVariable int rollNo) {
        return studentService.deleteStudent(rollNo);
    }

}
