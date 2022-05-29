package com.designpattern.strategy_pattern.solution.eating;

public class NoEatingStrategy implements IEatingStrategy {
    @Override
    public void eat() {
        System.out.println("I Don't Eat");
    }
}
