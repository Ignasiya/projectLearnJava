package Patterns.strategyPattern.Duck;

import Patterns.strategyPattern.FlyBehavior.FlyWithWings;
import Patterns.strategyPattern.QuackBehavior.Quack;

public class RedheadDuck extends Duck{

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Я рыжеволосый утенок");
    }
}
