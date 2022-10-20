package com.college.college.departments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/departments")
    List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/departments/{id}")
    Department getDepartmentById(@PathVariable int id) {
        return departmentService.getDepartmentById(id);
    }

    @PostMapping("/departments")
    boolean addDepartment(@RequestBody Department department) {
        return departmentService.addDepartment(department);
    }

    @PutMapping("/departments")
    boolean updateDepartment(@RequestBody Department department) {
        return departmentService.updateDepartment(department);
    }

    @DeleteMapping("/departments/{id}")
    boolean deleteDepartment(@PathVariable int id) {
        return departmentService.deleteDepartment(id);
    }

}
