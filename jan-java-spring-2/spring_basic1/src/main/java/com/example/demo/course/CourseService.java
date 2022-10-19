package com.example.demo.course;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    List<Course> courseList = new ArrayList<>();

    List<Course> getAllCourse() {
        return courseList;
    }

    boolean addCourse(Course courseObj) {
        courseList.add(courseObj);
        return true;
    }

    boolean updateCourse(Course courseObj) {
        for (int i = 0; i < courseList.size(); i++) {
            if (courseObj.id == courseList.get(i).id) {
                courseList.set(i, courseObj);
                return true;
            }
        }
        return false;
    }

    boolean deleteCourse(int id) {
        for (int i = 0; i < courseList.size(); i++) {
            if (id == courseList.get(i).id) {
                courseList.remove(i);
                return true;
            }
        }
        return false;
    }
}
