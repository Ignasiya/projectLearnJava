package Patterns.FactoryPattern.FactoryMethod.PizzaStore;

import Patterns.FactoryPattern.FactoryMethod.Pizza.MoscowStyle.*;
import Patterns.FactoryPattern.FactoryMethod.Pizza.Pizza;

public class MoscowStylePizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new MoscowStyleCheesePizza();
        } else if (item.equals("pepperoni")) {
            return new MoscowStylePepperoniPizza();
        } else if (item.equals("clam")) {
            return new MoscowStyleClamPizza();
        } else if (item.equals("veggie")) {
            return new MoscowStyleVeggiePizza();
        } else return null;
    }
}
