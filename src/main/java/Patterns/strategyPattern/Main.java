package Patterns.strategyPattern;

import Patterns.strategyPattern.Duck.*;

public class Main {
    public static void main(String[] args) {
        Duck[] ducks = {
                new MallardDuck(),
                new RedheadDuck(),
                new RubberDuck(),
                new DecoyDuck(),
                new ModelDuck()
        };
        for (Duck duck : ducks) {
            duck.display();
            duck.performFly();
            duck.performQuack();
            System.out.println();
        }
    }
}
