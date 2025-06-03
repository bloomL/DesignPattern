package com.practice.unit1;

public class Quack implements QuackBehavor {
    @Override
    public void quack() {
        System.out.println("呱呱呱！");
    }
}