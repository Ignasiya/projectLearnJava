package Patterns.StrategyPattern.Duck;

import Patterns.StrategyPattern.FlyBehavior.FlyNoWay;
import Patterns.StrategyPattern.QuackBehavior.MuteQuack;

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