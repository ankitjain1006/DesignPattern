package com.designpattern.strategy_pattern.solution.swim;

public class NoSwimmingStrategy implements ISwimmingStrategy {

    @Override
    public String swim() {
        return ("I can't swim");
    }
}
