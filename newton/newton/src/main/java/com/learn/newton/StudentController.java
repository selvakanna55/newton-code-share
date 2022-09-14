package com.learn.newton;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {
    @Autowired  // creating obj
    StudentService studService;


    @RequestMapping("/helloworld")
    public String helloWorld() {
        return "Hello. How are you?";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/v1/students")
    public List<Student> getStudents() {
        return studService.getAllStudents();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/v1/student/{rollNo}")
        public Student getStudent(@PathVariable("rollNo") Integer rollNo) {
        System.out.println(rollNo);
        return studService.getStudentByRollNo(rollNo);
    }


}
