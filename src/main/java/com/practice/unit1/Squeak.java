package com.practice.unit1;

public class Squeak implements QuackBehavor {
    @Override
    public void quack() {
        System.out.println("吱吱吱！");
    }
}