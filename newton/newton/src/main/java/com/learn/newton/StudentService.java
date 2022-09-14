package com.learn.newton;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    List<Student> studentsList = Arrays.asList(
            new Student("Abcd", 3, "BE", "Computer"),
            new Student("Efgh", 2, "BTech", "Information Systems"),
            new Student("Mnop", 1, "BTech", "Information Systems")
    );

    List<Student> getAllStudents() {
        return studentsList;
    }

    public Student getStudentByRollNo(Integer roll) {
        Optional<Student> op = studentsList.stream().filter(s -> (roll == s.rollNo)).findFirst();
        if (op.isPresent()) return op.get();
        return null;
    }
}
