package Patterns.FactoryPattern.v2FactoryMethod.PizzaStore;


import Patterns.FactoryPattern.v2FactoryMethod.Pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza (String type) {
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
