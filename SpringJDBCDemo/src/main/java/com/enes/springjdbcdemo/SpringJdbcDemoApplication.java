package com.enes.springjdbcdemo;

import com.enes.springjdbcdemo.model.Student;
import com.enes.springjdbcdemo.services.StudentServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);

        Student student = context.getBean(Student.class);
        student.setRollNo(15);
        student.setName("Enes");
        student.setMarks(100);

        StudentServices studentServices = context.getBean(StudentServices.class);
        studentServices.addStudent(student);

        List<Student> students = studentServices.getStudents();
        System.out.println(students);
    }

}
