package Patterns.FactoryPattern.SimpleFactory;

import Patterns.FactoryPattern.SimpleFactory.Pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza1 = store.orderPizza("cheese");
        System.out.println("Клиент заказал " + pizza1.getName() + "\n");

        Pizza pizza2 = store.orderPizza("pepperoni");
        System.out.println("Клиент заказал " + pizza2.getName() + "\n");

        Pizza pizza3 = store.orderPizza("clam");
        System.out.println("Клиент заказал " + pizza3.getName() + "\n");

        Pizza pizza4 = store.orderPizza("veggie");
        System.out.println("Клиент заказал " + pizza4.getName() + "\n");
    }
}
