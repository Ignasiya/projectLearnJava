package Patterns.strategyPattern.Duck;

import Patterns.strategyPattern.FlyBehavior.FlyNoWay;
import Patterns.strategyPattern.QuackBehavior.Quack;

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
