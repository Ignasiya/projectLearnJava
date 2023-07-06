package Patterns.FactoryPattern.FactoryMethod;

import Patterns.FactoryPattern.FactoryMethod.Branches.Moscow.MoscowPizzaStore;
import Patterns.FactoryPattern.FactoryMethod.Branches.SaintPetersburg.SPPizzaStore;
import Patterns.FactoryPattern.FactoryMethod.Branches.Sochi.SochiPizzaStore;
import Patterns.FactoryPattern.FactoryMethod.Pizza.Pizza;
import Patterns.FactoryPattern.FactoryMethod.PizzaStore.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore moscowStore = new MoscowPizzaStore();
        PizzaStore spStore = new SPPizzaStore();
        PizzaStore sochiStore = new SochiPizzaStore();

        Pizza pizza1 = moscowStore.orderPizza("cheese");
        System.out.println("Клиент заказал " + pizza1.getName() + "\n");
    }
}
