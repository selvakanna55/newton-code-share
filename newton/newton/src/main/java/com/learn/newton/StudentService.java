package com.learn.newton;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    List<Student> studentsList = new ArrayList<>();

    StudentService() {
        studentsList.add(new Student("Abcd", 3, "BE", "Computer"));
        studentsList.add(new Student("MNOP", 4, "MCA", "Account"));
    }

    List<Student> getAllStudents() {
        return studentsList;
    }

    public Student getStudentByRollNo(Integer roll) {
        Optional<Student> op = studentsList.stream().filter(s -> (roll == s.rollNo)).findFirst();
        if (op.isPresent()) return op.get();
        return null;
    }

    public void addStudent(Student stud) {
        studentsList.add(stud);
    }

    public void updateStudent(int rollNo, Student st) {
        for (int i = 0; i < studentsList.size(); i++) {
            Student cur = studentsList.get(i);
            if (cur.rollNo == rollNo) {
                studentsList.set(i, st);
            }
        }
        return;
    }

    public void deleteStudentByRollNo(Integer rollNo) {
        studentsList.removeIf(stud -> stud.rollNo == rollNo);
    }
}
