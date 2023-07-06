package Patterns.FactoryPattern.v3AbstactFactory;

import Patterns.FactoryPattern.v3AbstactFactory.Branches.Moscow.MoscowPizzaStore;
import Patterns.FactoryPattern.v3AbstactFactory.Branches.SaintPetersburg.SPPizzaStore;
import Patterns.FactoryPattern.v3AbstactFactory.Branches.Sochi.SochiPizzaStore;
import Patterns.FactoryPattern.v3AbstactFactory.Pizza.Pizza;
import Patterns.FactoryPattern.v3AbstactFactory.PizzaStore.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore moscowStore = new MoscowPizzaStore();
        PizzaStore spStore = new SPPizzaStore();
        PizzaStore sochiStore = new SochiPizzaStore();

        Pizza pizza1 = moscowStore.orderPizza("cheese");
        System.out.println("Клиент заказал " + pizza1.getName() + "\n");
    }
}
