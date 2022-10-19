package com.example.demo.student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    List<Student> students = new ArrayList<>();

    StudentService() {
        students.add(new Student("Newton", 1, 99.9));
        students.add(new Student("Abcd", 4, 90.5));
        students.add(new Student("MNOp", 7, 90.5));
    }

    Student createStudent(Student student) {
        students.add(student);
        return student;
    }

    List<Student> getStudents() {
        return students;
    }

    Student getStudentByRollNo(int rollNo) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).rollNo == rollNo) {
                return students.get(i);
            }
        }
        return null;
    }

    boolean updateStudent(Student student) {
        boolean isUpdated = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).rollNo == student.rollNo) {
                students.set(i, student);
                isUpdated = true;
                break;
            }
        }
        return isUpdated;
    }

    boolean deleteStudent(int rollNo) {
        boolean isDelete = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).rollNo == rollNo) {
                students.remove(i);
                isDelete = true;
                break;
            }
        }
        return isDelete;
    }


}
