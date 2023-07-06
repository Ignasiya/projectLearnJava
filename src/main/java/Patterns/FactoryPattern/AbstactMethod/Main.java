package Patterns.FactoryPattern.AbstactMethod;

import Patterns.FactoryPattern.AbstactMethod.Branches.Moscow.MoscowPizzaStore;
import Patterns.FactoryPattern.AbstactMethod.Branches.SaintPetersburg.SPPizzaStore;
import Patterns.FactoryPattern.AbstactMethod.Branches.Sochi.SochiPizzaStore;
import Patterns.FactoryPattern.AbstactMethod.Pizza.Pizza;
import Patterns.FactoryPattern.AbstactMethod.PizzaStore.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore moscowStore = new MoscowPizzaStore();
        PizzaStore spStore = new SPPizzaStore();
        PizzaStore sochiStore = new SochiPizzaStore();

        Pizza pizza1 = moscowStore.orderPizza("cheese");
        System.out.println("Клиент заказал " + pizza1.getName() + "\n");
    }
}
