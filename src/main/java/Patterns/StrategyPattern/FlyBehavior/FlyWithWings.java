package Patterns.StrategyPattern.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Я летаю!");
    }
}
