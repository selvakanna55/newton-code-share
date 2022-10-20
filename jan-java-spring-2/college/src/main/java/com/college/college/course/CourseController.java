package com.college.college.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    List<Course> getAllCourses( @RequestParam(required = false) Integer mark) {
        System.out.println(mark);
        return courseService.getAllCourses();
    }

    @GetMapping("/courses/{id}")
    Course getCourseById(int id) {
        return courseService.getCourseById(id);
    }

    @PostMapping("/courses")
    boolean addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @PutMapping("/courses")
    boolean updateCourse(@RequestBody Course course) {
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{id}")
    boolean deleteCourse(@PathVariable int id) {
        return courseService.deleteCourse(id);
    }
}
