package patterns.factoryPattern.v2FactoryMethod.PizzaStore;


import patterns.factoryPattern.v2FactoryMethod.Pizza.Pizza;

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
