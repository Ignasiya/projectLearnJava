package Patterns.factoryPattern.v2FactoryMethod.Pizza.SPStyle;

import Patterns.factoryPattern.v2FactoryMethod.Pizza.Pizza;

public class SPStyleClamPizza extends Pizza {
    public SPStyleClamPizza() {
        name = "Питерская Пицца с моллюсками";
        dough = "Тесто для пиццы";
        sauce = "Томатный соус";

        toppings.add("Мидии");
        toppings.add("Чеснок");
        toppings.add("Сыр Моцарелла");
    }
}
