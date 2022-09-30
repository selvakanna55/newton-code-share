package com.project.newton.service;

import com.project.newton.models.Course;
import com.project.newton.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;


    public List<Course> getAllCourses() {
        return (List<Course>) courseRepository.findAll();
    }

    public Course getCourse(Integer id) {
//        return courseRepository.findById(id).get();
        return courseRepository.findById(id).get();
        // select * from course where id = id;
    }

    public List<Course> getCourseByDeptId(Integer id) {
        return courseRepository.findByDepartmentDeptId(id);
    }

    public boolean addCourse(Course course) {
        courseRepository.save(course);
        return true;
    }

    // insert
    // update
    // upsert
    public boolean updateCourse(Course course) {
        courseRepository.save(course);
        return true;
    }

    public boolean deleteCourse(Integer id) {
        courseRepository.deleteById(id);
        return true;
    }
}
