package com.designpattern.strategy_pattern.solution.eating;

public class AnythingEatingStrategy implements IEatingStrategy {
    @Override
    public void eat() {
        System.out.println("I can eat anything");
    }
}
