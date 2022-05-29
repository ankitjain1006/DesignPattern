package com.designpattern.strategy_pattern.solution;

import com.designpattern.strategy_pattern.problem_with_inheritance.IDuckInterface;
import com.designpattern.strategy_pattern.solution.display.IDisplayStrategy;
import com.designpattern.strategy_pattern.solution.eating.IEatingStrategy;
import com.designpattern.strategy_pattern.solution.flying.IFlyingStrategy;
import com.designpattern.strategy_pattern.solution.swim.ISwimmingStrategy;

public class Duck implements IDuckInterface {
    IFlyingStrategy flyingStrategy;
    IEatingStrategy eatingStrategy;
    IDisplayStrategy displayStrategy;
    ISwimmingStrategy swimmingStrategy;

    public Duck(IFlyingStrategy flyingStrategy, IEatingStrategy eatingStrategy, IDisplayStrategy displayStrategy, ISwimmingStrategy swimmingStrategy) {
        this.flyingStrategy = flyingStrategy;
        this.eatingStrategy = eatingStrategy;
        this.displayStrategy = displayStrategy;
        this.swimmingStrategy = swimmingStrategy;
    }

    @Override
    public void fly() {
        flyingStrategy.fly();
    }

    @Override
    public void eat() {
        eatingStrategy.eat();
    }

    @Override
    public void display() {
        displayStrategy.display();
    }

    @Override
    public String swim() {
        return swimmingStrategy.swim();
    }
}
