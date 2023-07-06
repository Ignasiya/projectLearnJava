package Patterns.FactoryPattern.FactoryMethod.Pizza.MoscowStyle;

import Patterns.FactoryPattern.FactoryMethod.Pizza.Pizza;

public class MoscowStyleVeggiePizza extends Pizza {
    public MoscowStyleVeggiePizza() {
        name = "Московская Вегетарианская пицца";
        dough = "Тесто для пиццы";
        sauce = "Томатный соус";

        toppings.add("Лук");
        toppings.add("Сыр Моцарелла");
    }
}
