package com.example.demo.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    List<Course> getAllCourse() {
        return (List<Course>) courseRepository.findAll();
    }

    boolean addCourse(Course courseObj) {
        courseRepository.save(courseObj);
        return true;
    }

    boolean updateCourse(Course courseObj) {
        courseRepository.save(courseObj);
        return true;
    }

    boolean deleteCourse(int id) {
        courseRepository.deleteById(id);
        return true;
    }
}
