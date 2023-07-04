package Patterns.StrategyPattern.Duck;

import Patterns.StrategyPattern.FlyBehavior.FlyWithWings;
import Patterns.StrategyPattern.QuackBehavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Я утка-кряква");
    }
}
