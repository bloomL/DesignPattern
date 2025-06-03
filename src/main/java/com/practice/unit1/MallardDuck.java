package com.practice.unit1;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();    // 使用具体的飞行策略
        quackBehavior = new Quack();         // 使用具体的叫声策略
    }
}