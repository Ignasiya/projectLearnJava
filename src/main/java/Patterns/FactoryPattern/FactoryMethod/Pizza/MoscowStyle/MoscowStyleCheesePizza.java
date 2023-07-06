package Patterns.FactoryPattern.FactoryMethod.Pizza.MoscowStyle;

import Patterns.FactoryPattern.FactoryMethod.Pizza.Pizza;

public class MoscowStyleCheesePizza extends Pizza {
    public MoscowStyleCheesePizza() {
        name = "Московская Сырная пицца";
        dough = "Тесто с тонкой корочкой";
        sauce = "Соус Маринара";

        toppings.add("Сыр Реджано");
    }
}
