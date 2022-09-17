package com.learn.newton.controllers;

import java.util.*;

import com.learn.newton.models.College;
import com.learn.newton.services.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CollegeController {

    @Autowired
    CollegeService clgService;

    @RequestMapping(method = RequestMethod.GET, value = "/api/v1/colleges")
    List<College> getCollegeList() {
        return clgService.getAllColleges();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/api/v1/colleges")
    boolean createNewCollege(@RequestBody College clg) {
        System.out.println(clg);
        clgService.creteCollege(clg);
        return true;
    }
}
