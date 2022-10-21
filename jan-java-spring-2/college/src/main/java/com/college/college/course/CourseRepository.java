package com.college.college.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

public interface CourseRepository extends CrudRepository<Course, Integer> {
}

//import java.util.List;
//
//@Repository
//class CourseRepository {
//    @Autowired
//    JdbcTemplate jdbc;
//
//    List<Course> findAll() {
//        return jdbc.query("select * from course",
//                new BeanPropertyRowMapper<>(Course.class));
//    }
//
//    List<Course> findById(int id) {
//        String query = "select * from course where id=" + id;
//        return jdbc.query(query, new BeanPropertyRowMapper<>(Course.class));
//    }
//
//    void deleteById(int id) {
//        String query = "delete from course where id=" + id;
//        jdbc.execute(query);
//    }
//
//    void save(Course course) {
//        String query = " insert into course values(" + course.id + ", '" + course.name + "', " + course.hours + ");";
//        // insert into  course values(  10          , '     mongo          ',             10);
//        jdbc.execute(query);
//    }
//
//    void update(Course course) {
//        String query = " update course set name='" + course.name + "', hours=" + course.hours + " where id=" + course.id + ";";
//        System.out.println(query);
//
//        // update course set name='   mongo DB      ', hours=    99            where id=     10;
//        jdbc.execute(query);
//    }
//
//}