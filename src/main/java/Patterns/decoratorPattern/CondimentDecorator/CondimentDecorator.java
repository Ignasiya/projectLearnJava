package Patterns.decoratorPattern.CondimentDecorator;

import Patterns.decoratorPattern.Beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}

