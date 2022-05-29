package com.designpattern.strategy_pattern.problem_with_inheritance;

public class RubberDuck implements IDuckInterface {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

    @Override
    public void eat() {
        System.out.println("I Don't Eat");
    }

    @Override
    public void display() {
        System.out.println("I am yellow");
    }

    @Override
    public String swim() {
        return ("I can't swim");
    }
}
