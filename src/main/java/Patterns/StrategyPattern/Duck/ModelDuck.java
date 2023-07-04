package Patterns.StrategyPattern.Duck;

import Patterns.StrategyPattern.FlyBehavior.FlyNoWay;
import Patterns.StrategyPattern.QuackBehavior.MuteQuack;
import Patterns.StrategyPattern.QuackBehavior.Quack;

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
