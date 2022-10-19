package com.example.demo.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CourseController {

    @Autowired
    CourseService cs;

    @GetMapping("/courses")
    List<Course> getAllCourse() {
        return cs.getAllCourse();
    }

    @PostMapping("/courses")
    boolean addCourse(@RequestBody Course courseObj) {
        return cs.addCourse(courseObj);
    }

    @PutMapping("/courses")
    boolean updateCourse(@RequestBody Course courseObj) {
        return cs.updateCourse(courseObj);
    }

    @DeleteMapping("/courses/{id}")
    boolean deleteCourse(@PathVariable int id) {
        return cs.deleteCourse(id);
    }


}
