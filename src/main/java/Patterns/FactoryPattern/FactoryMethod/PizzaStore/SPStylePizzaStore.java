package Patterns.FactoryPattern.FactoryMethod.PizzaStore;

import Patterns.FactoryPattern.FactoryMethod.Pizza.Pizza;
import Patterns.FactoryPattern.FactoryMethod.Pizza.SPStyle.*;

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
