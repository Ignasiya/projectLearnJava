package patterns.decoratorPattern;

import patterns.decoratorPattern.Beverage.*;
import patterns.decoratorPattern.CondimentDecorator.Mocha;
import patterns.decoratorPattern.CondimentDecorator.Soy;
import patterns.decoratorPattern.CondimentDecorator.Whip;

public class Main {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1);
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2);
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3);
    }
}
