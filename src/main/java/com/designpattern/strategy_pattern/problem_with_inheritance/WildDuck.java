package com.designpattern.strategy_pattern.problem_with_inheritance;

public class WildDuck implements IDuckInterface {
    @Override
    public void fly() {
        System.out.println("I can fly anywhere");
    }

    @Override
    public void eat() {
        System.out.println("I can eat anything");
    }

    @Override
    public void display() {
        System.out.println("I am yellow/black/white");
    }

    @Override
    public String swim() {
        return ("I can swim with feather");
    }
}
