package Patterns.StrategyPattern.Duck;

import Patterns.StrategyPattern.FlyBehavior.FlyNoWay;
import Patterns.StrategyPattern.QuackBehavior.Squeak;

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
