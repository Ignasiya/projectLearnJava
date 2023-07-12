package patterns.factoryPattern.v2FactoryMethod.Pizza.MoscowStyle;

import patterns.factoryPattern.v2FactoryMethod.Pizza.Pizza;

public class MoscowStyleCheesePizza extends Pizza {
    public MoscowStyleCheesePizza() {
        name = "Московская Сырная пицца";
        dough = "Тесто с тонкой корочкой";
        sauce = "Соус Маринара";

        toppings.add("Сыр Реджано");
    }
}
