package com.designpattern.strategy_pattern.solution.flying;

public class LimitedFlyingStrategy implements IFlyingStrategy {
    @Override
    public void fly() {
        System.out.println("I can fly within my space");
    }
}
