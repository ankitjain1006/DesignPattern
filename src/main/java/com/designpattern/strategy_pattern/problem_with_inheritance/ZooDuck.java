package com.designpattern.strategy_pattern.problem_with_inheritance;

public class ZooDuck implements IDuckInterface {
    @Override
    public void fly() {
        System.out.println("I can fly within my space");
    }

    @Override
    public void eat() {
        System.out.println("I eat prepared food");
    }

    @Override
    public void display() {
        System.out.println("I am yellow");
    }

    @Override
    public String swim() {
        return ("I can swim with feather");
    }
}
