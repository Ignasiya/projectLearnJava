package patterns.factoryPattern.v2FactoryMethod.Pizza.MoscowStyle;

import patterns.factoryPattern.v2FactoryMethod.Pizza.Pizza;

public class MoscowStyleVeggiePizza extends Pizza {
    public MoscowStyleVeggiePizza() {
        name = "Московская Вегетарианская пицца";
        dough = "Тесто для пиццы";
        sauce = "Томатный соус";

        toppings.add("Лук");
        toppings.add("Сыр Моцарелла");
    }
}
