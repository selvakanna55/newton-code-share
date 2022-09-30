package com.project.newton.service;

import com.project.newton.models.Department;
import com.project.newton.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments() {
        return (List<Department>) departmentRepository.findAll();
    }

    public Department getDepartment(Integer id) {
        return departmentRepository.findById(id).get();
    }

    public boolean addDepartment(Department department) {
        departmentRepository.save(department);
        return true;
    }

    public boolean updateDepartment(Department department) {
        departmentRepository.save(department);
        return true;
    }

    public boolean deleteDepartment(Integer id) {
        departmentRepository.deleteById(id);
        return true;
    }
}
