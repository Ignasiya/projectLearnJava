package Patterns.strategyPattern.Duck;

import Patterns.strategyPattern.FlyBehavior.FlyNoWay;
import Patterns.strategyPattern.QuackBehavior.Squeak;

public class RubberDuck extends Duck{

    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("Я резиновый утенок");
    }
}
