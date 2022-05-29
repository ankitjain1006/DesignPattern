package com.designpattern.strategy_pattern.solution.flying;

public class AnywhereFlyingStrategy implements IFlyingStrategy {
    @Override
    public void fly() {
        System.out.println("I can fly anywhere");
    }
}
