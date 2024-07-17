package com.enes.springsecdemo.controller;

import com.enes.springsecdemo.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<Student>(List.of(
            new Student(1, "Enes", "Java"),
            new Student(2, "Ali", "Python"),
            new Student(3, "Veli", "C++")
    ));

    @GetMapping("/csrf")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping("/students")
    public String addStudent(@RequestBody Student student) {
        System.out.println("Student added: " + student);
        students.add(student); // This will throw an UnsupportedOperationException (immutable list)
        System.out.println("Students: " + students);
        return "Student added successfully";
    }
}
