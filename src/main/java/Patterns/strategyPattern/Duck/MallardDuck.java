package Patterns.strategyPattern.Duck;

import Patterns.strategyPattern.FlyBehavior.FlyWithWings;
import Patterns.strategyPattern.QuackBehavior.Quack;

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