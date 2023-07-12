package patterns.strategyPattern.Duck;

import patterns.strategyPattern.FlyBehavior.FlyNoWay;
import patterns.strategyPattern.QuackBehavior.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Я утка-приманка");
    }
}
