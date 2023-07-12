package patterns.strategyPattern.Duck;

import patterns.strategyPattern.FlyBehavior.FlyWithWings;
import patterns.strategyPattern.QuackBehavior.Quack;

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
