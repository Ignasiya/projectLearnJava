package Patterns.StrategyPattern.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Я летаю как ракета!");
    }
}
