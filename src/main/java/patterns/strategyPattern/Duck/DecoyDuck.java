package patterns.strategyPattern.Duck;

import patterns.strategyPattern.FlyBehavior.FlyNoWay;
import patterns.strategyPattern.QuackBehavior.MuteQuack;

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
