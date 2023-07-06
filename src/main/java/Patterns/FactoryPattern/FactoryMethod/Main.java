package Patterns.FactoryPattern.FactoryMethod;

import Patterns.FactoryPattern.FactoryMethod.PizzaStore.MoscowStylePizzaStore;
import Patterns.FactoryPattern.FactoryMethod.PizzaStore.PizzaStore;
import Patterns.FactoryPattern.FactoryMethod.PizzaStore.SPStylePizzaStore;
import Patterns.FactoryPattern.FactoryMethod.Pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaStore SPStore = new SPStylePizzaStore();
        PizzaStore MoscowStore = new MoscowStylePizzaStore();


        Pizza pizza1 = SPStore.orderPizza("cheese");
        System.out.println("Клиент заказал " + pizza1.getName() + "\n");

        Pizza pizza2 = MoscowStore.orderPizza("pepperoni");
        System.out.println("Клиент заказал " + pizza2.getName() + "\n");

        Pizza pizza3 = SPStore.orderPizza("clam");
        System.out.println("Клиент заказал " + pizza3.getName() + "\n");

        Pizza pizza4 = MoscowStore.orderPizza("veggie");
        System.out.println("Клиент заказал " + pizza4.getName() + "\n");
    }
}
