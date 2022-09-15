package com.learn.newton;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return studService.getStudentByRollNo(rollNo);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/api/v1/student/{rollNo}")
    public boolean deleteStudent(@PathVariable("rollNo") Integer rollNo) {
        studService.deleteStudentByRollNo(rollNo);
        return true;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/api/v1/student/{rollNo}")
    public boolean updateStudent(@RequestBody Student stud, @PathVariable("rollNo") Integer rollNo) {
        studService.updateStudent(rollNo, stud);
        return true;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/api/v1/student")
    public boolean addStudent(@RequestBody Student stud) {
        studService.addStudent(stud);
        return true;
    }


}
//design
//book my show
//theaters
//user
//customer, admin
//food coat
//set flims
//flims
//admin
//snake and ladder
//ATM


// parking lot


//complex
//chess board
