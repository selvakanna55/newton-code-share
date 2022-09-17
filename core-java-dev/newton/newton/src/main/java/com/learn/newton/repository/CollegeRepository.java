package com.learn.newton.repository;

import com.learn.newton.models.College;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends CrudRepository<College, Integer> {
}
