package com.designpattern.strategy_pattern.solution.eating;

public class PreparedEatingStrategy implements IEatingStrategy {
    @Override
    public void eat() {
        System.out.println("I eat prepared food");
    }
}
