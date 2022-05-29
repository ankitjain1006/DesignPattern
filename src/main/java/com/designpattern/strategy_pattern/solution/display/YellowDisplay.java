package com.designpattern.strategy_pattern.solution.display;

public class YellowDisplay implements IDisplayStrategy {

    @Override
    public void display() {
        System.out.println("I am yellow");
    }
}
