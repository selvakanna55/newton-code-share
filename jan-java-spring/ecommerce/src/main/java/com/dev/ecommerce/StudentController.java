package com.dev.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(method = RequestMethod.GET, value = "/students")
    List<Student> getAllStudent() {
        return studentService.getAllStudents();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/students/{id}")
    Student getStudentById(@PathVariable Integer id) {
        return studentService.getStudentByRollNo(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/students")
    boolean getStudentById(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}")
    boolean deleteStudentById(@PathVariable Integer id) {
        return studentService.deleteStudent(id);
    }


    @RequestMapping(method = RequestMethod.PUT, value = "/students")
    boolean updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }
}
