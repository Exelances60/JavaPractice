package com.enes.app;



public class Desktop implements Computer{
    @Override
    public void compile() {
        System.out.println("Compiling code using Desktop");
    }
}
