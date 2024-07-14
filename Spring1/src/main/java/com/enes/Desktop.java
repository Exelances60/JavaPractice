package com.enes;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public Desktop() {
        System.out.println("Desktop constructor");
    }

    @Override
    public void code() {
        System.out.println("Coding in C++");
    }
}
