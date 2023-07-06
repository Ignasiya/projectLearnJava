package Patterns.DecoratorPattern.CondimentDecorator;

import Patterns.DecoratorPattern.Beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}

