package com.project.newton.controllers;

import com.project.newton.models.Department;
import com.project.newton.service.DepartmentService;
import com.project.newton.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @RequestMapping(method = RequestMethod.GET, value = "/departments")
    List<Department> getAllDepts() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/departments/{id}")
    Department getDepartment(@PathVariable Integer id) {
        return departmentService.getDepartment(id);
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
    boolean deleteDepartment(@PathVariable Integer id) {
        return departmentService.deleteDepartment(id);
    }
}
