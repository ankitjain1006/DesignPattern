package com.designpattern.strategy_pattern.solution.flying;

public class NoFlyingStrategy implements IFlyingStrategy {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
