package com.designpattern.strategy_pattern.solution.swim;

public class SwimmingStrategy implements ISwimmingStrategy {

    @Override
    public String swim() {
        return ("I can swim with feather");
    }
}
