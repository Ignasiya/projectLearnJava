package patterns.decoratorPattern.CondimentDecorator;

import patterns.decoratorPattern.Beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}

