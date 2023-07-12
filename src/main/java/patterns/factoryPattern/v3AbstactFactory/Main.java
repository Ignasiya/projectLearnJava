package patterns.factoryPattern.v3AbstactFactory;

import patterns.factoryPattern.v3AbstactFactory.Branches.Moscow.MoscowPizzaStore;
import patterns.factoryPattern.v3AbstactFactory.Branches.SaintPetersburg.SPPizzaStore;
import patterns.factoryPattern.v3AbstactFactory.Branches.Sochi.SochiPizzaStore;
import patterns.factoryPattern.v3AbstactFactory.Pizza.Pizza;
import patterns.factoryPattern.v3AbstactFactory.PizzaStore.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore moscowStore = new MoscowPizzaStore();
        PizzaStore spStore = new SPPizzaStore();
        PizzaStore sochiStore = new SochiPizzaStore();

        Pizza pizza1 = moscowStore.orderPizza("cheese");
        System.out.println("Клиент заказал " + pizza1.getName() + "\n");
    }
}
