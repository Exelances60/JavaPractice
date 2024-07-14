package com.enes.app;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void compile() {
        System.out.println("Compiling code using Laptop");
    }
}
