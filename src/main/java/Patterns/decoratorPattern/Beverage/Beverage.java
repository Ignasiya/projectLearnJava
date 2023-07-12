package Patterns.decoratorPattern.Beverage;

public abstract class Beverage {
    protected String description = "Неизвестный напиток";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    @Override
    public String toString() {
        return this.getDescription() + " $" + this.cost();
    }
}
