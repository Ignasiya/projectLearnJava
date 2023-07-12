package patterns.factoryPattern.v2FactoryMethod.Pizza.SPStyle;

import patterns.factoryPattern.v2FactoryMethod.Pizza.Pizza;

public class SPStyleCheesePizza extends Pizza {
    public SPStyleCheesePizza() {
        name = "Питерская Сырная пицца";
        dough = "Тесто с тонкой корочкой";
        sauce = "Соус Маринара";

        toppings.add("Сыр Реджано");
    }
}
