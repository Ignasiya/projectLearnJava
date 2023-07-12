package Patterns.strategyPattern.Duck;

import Patterns.strategyPattern.FlyBehavior.FlyNoWay;
import Patterns.strategyPattern.QuackBehavior.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Я подсадная утка");
    }
}
