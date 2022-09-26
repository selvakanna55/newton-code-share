package com.project.newton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;


    public List<Course> getAllCourses() {
        return (List<Course>) courseRepository.findAll();
    }

    public Course getCourse(Integer id) {
        return courseRepository.findById(id).get();
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
