package com.enes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {

    private int age;
    @Autowired
    @Qualifier("desktop")
    private Computer computer;

/*    @ConstructorProperties({"age", "computer"})
    public Alien(int age, Computer computer) {
        this.age = age;
        this.computer = computer;
    }*/

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code() {
        System.out.println("Hello World!asdasd");
        computer.code();
    }
}
