package com.college.college.course;

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

    public Course getCourseById(int id) {
        return courseRepository.findById(id).get();
    }

    public boolean addCourse(Course course) {
        courseRepository.save(course);
        return true;
    }

    public boolean updateCourse(Course course) {
        courseRepository.save(course);
        return true;
    }

    public boolean deleteCourse(int id) {
        courseRepository.deleteById(id);
        return true;
    }
}
