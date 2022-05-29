package com.designpattern.strategy_pattern.solution.eating;

public class PizzaEatingStrategy implements IEatingStrategy {
    @Override
    public void eat() {
        System.out.println("I Eat Pizza");
    }
}
