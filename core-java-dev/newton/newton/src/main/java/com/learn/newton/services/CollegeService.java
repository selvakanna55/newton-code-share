package com.learn.newton.services;

import java.util.*;

import com.learn.newton.models.College;
import com.learn.newton.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeService {
    @Autowired
    CollegeRepository clgRepo;

    public List<College> getAllColleges() {
        return (List<College>) clgRepo.findAll();
    }

        public void creteCollege(College clg) {
        System.out.println(clg);
        clgRepo.save(clg);
    }

}
