package patterns.strategyPattern.Duck;

import patterns.strategyPattern.FlyBehavior.FlyNoWay;
import patterns.strategyPattern.QuackBehavior.Squeak;

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
