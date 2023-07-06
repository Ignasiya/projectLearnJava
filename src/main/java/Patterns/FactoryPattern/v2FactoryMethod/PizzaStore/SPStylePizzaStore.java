package Patterns.FactoryPattern.v2FactoryMethod.PizzaStore;

import Patterns.FactoryPattern.v2FactoryMethod.Pizza.Pizza;
import Patterns.FactoryPattern.v2FactoryMethod.Pizza.SPStyle.*;

public class SPStylePizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new SPStyleCheesePizza();
        } else if (item.equals("pepperoni")) {
            return new SPStylePepperoniPizza();
        } else if (item.equals("clam")) {
            return new SPStyleClamPizza();
        } else if (item.equals("veggie")) {
            return new SPStyleVeggiePizza();
        } else return null;
    }
}
