package Patterns.StrategyPattern.Duck;

import Patterns.StrategyPattern.FlyBehavior.FlyWithWings;
import Patterns.StrategyPattern.QuackBehavior.Quack;

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
