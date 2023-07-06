package Patterns.FactoryPattern.v2FactoryMethod.Pizza.SPStyle;

import Patterns.FactoryPattern.v2FactoryMethod.Pizza.Pizza;

public class SPStyleVeggiePizza extends Pizza {
    public SPStyleVeggiePizza() {
        name = "Питерская Вегетарианская пицца";
        dough = "Тесто для пиццы";
        sauce = "Томатный соус";

        toppings.add("Лук");
        toppings.add("Сыр Моцарелла");
    }
}