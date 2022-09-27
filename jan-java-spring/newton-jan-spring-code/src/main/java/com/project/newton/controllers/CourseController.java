package com.project.newton.controllers;

import com.project.newton.models.Course;
import com.project.newton.models.Department;
import com.project.newton.service.CourseService;
import com.project.newton.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// TODO: parent url, tree
@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @Autowired
    DepartmentService departmentService;

    @RequestMapping(method = RequestMethod.GET, value = "/courses")
    List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/courses/{id}")
    Course getCourse(@PathVariable Integer id) {
        return courseService.getCourse(id);
    }


    @PostMapping("/department/{deptId}/course")
    boolean addCourse(@PathVariable Integer deptId, @RequestBody Course course) {
        course.department = departmentService.getDepartment(deptId);
        return courseService.addCourse(course);
    }

    @GetMapping("/department/{deptId}/course")
    List<Course> addCourse(@PathVariable Integer deptId) {
//        List<Course> courses = courseService.getAllCourses(); // 10^9
//        List<Course> result = new ArrayList<>();
//        for (Course course : courses) {
//            if (course.department!=null && course.department.getDeptId() == deptId) {
//                result.add(course);
//            }
//        }
//        return result;
        return courseService.getCourseByDeptId(deptId);
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
