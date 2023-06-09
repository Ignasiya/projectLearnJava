package patterns.factoryPattern.v2FactoryMethod.PizzaStore;

import patterns.factoryPattern.v2FactoryMethod.Pizza.MoscowStyle.*;
import patterns.factoryPattern.v2FactoryMethod.Pizza.Pizza;

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
