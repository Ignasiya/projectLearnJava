package patterns.strategyPattern.Duck;

import patterns.strategyPattern.FlyBehavior.FlyWithWings;
import patterns.strategyPattern.QuackBehavior.Quack;

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
