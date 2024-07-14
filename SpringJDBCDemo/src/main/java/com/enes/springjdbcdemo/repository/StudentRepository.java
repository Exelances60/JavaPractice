package com.enes.springjdbcdemo.repository;

import com.enes.springjdbcdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student student) {
        System.out.println("Student saved with repo");
        int efectedRows = jdbcTemplate.update("insert into student values(?,?,?)", student.getRollNo(), student.getName(), student.getMarks());
        System.out.println("Efected rows: " + efectedRows);
    }

    public List<Student> findAll() {
        String sql = "select * from student";

        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Student student = new Student();
            student.setRollNo(rs.getInt("rollNo"));
            student.setName(rs.getString("name"));
            student.setMarks(rs.getInt("marks"));
            return student;
        });
    }
}
