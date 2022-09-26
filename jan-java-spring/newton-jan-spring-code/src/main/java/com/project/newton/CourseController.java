package com.project.newton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// TODO: parent url, tree
@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping(method = RequestMethod.GET, value = "/courses")
    List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/courses/{id}")
    Course getCourse(@PathVariable Integer id) {
        return courseService.getCourse(id);
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
    boolean deleteCourse(@PathVariable Integer id) {
        return courseService.deleteCourse(id);
    }

}
