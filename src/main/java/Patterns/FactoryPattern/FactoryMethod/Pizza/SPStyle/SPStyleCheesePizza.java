package Patterns.FactoryPattern.FactoryMethod.Pizza.SPStyle;

import Patterns.FactoryPattern.FactoryMethod.Pizza.Pizza;

public class SPStyleCheesePizza extends Pizza {
    public SPStyleCheesePizza() {
        name = "Питерская Сырная пицца";
        dough = "Тесто с тонкой корочкой";
        sauce = "Соус Маринара";

        toppings.add("Сыр Реджано");
    }
}
