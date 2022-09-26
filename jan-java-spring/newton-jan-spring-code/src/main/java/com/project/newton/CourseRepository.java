package com.project.newton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


//
//public interface CourseRepository extends CrudRepository<Course, Integer> {
//}

@Repository
public class CourseRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void deleteById(Integer id) {
        jdbcTemplate.execute(" delete from course where  course_id=" + id + ";");
    }

    public void save(Course course) {
        String query = "insert into course values(" + course.courseId + ", " + course.duration + ", '" + course.name + "', " + course.studentsEnrolled + ");";
        System.out.println(query);
        jdbcTemplate.execute(query);
    }

    public void update(Course course) {
        String query = "update course set duration = "+course.duration+", name='"+course.name+"', students_enrolled="+course.studentsEnrolled+" where course_id="+course.courseId+";";
        System.out.println(query);
        jdbcTemplate.execute(query);
    }



    public Course findById(Integer id) {
        System.out.println("select * from course where course_id=" + id + ";");
        return jdbcTemplate.query("select * from course where course_id=" + id + ";", new BeanPropertyRowMapper<>(Course.class)).get(0);

    }

    public List<Course> findAll() {
        return jdbcTemplate.query("select * from course;", new BeanPropertyRowMapper<>(Course.class));
    }
}