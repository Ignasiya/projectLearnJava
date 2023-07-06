package Patterns.DecoratorPattern.CondimentDecorator;

import Patterns.DecoratorPattern.Beverage.Beverage;

public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
