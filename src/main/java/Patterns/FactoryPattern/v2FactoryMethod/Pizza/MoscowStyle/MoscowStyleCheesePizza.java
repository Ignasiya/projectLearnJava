package Patterns.FactoryPattern.v2FactoryMethod.Pizza.MoscowStyle;

import Patterns.FactoryPattern.v2FactoryMethod.Pizza.Pizza;

public class MoscowStyleCheesePizza extends Pizza {
    public MoscowStyleCheesePizza() {
        name = "Московская Сырная пицца";
        dough = "Тесто с тонкой корочкой";
        sauce = "Соус Маринара";

        toppings.add("Сыр Реджано");
    }
}
