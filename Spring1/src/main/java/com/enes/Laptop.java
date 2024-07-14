package com.enes;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    @Override
    public void code() {
        System.out.println("Coding in Java");
    }
}
