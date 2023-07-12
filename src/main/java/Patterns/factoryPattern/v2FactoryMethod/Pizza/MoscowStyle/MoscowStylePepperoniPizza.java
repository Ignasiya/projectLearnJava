package Patterns.factoryPattern.v2FactoryMethod.Pizza.MoscowStyle;

import Patterns.factoryPattern.v2FactoryMethod.Pizza.Pizza;

public class MoscowStylePepperoniPizza extends Pizza {
    public MoscowStylePepperoniPizza() {
        name = "Московская Пицца с пепперони";
        dough = "Тонкий лист хрустящего теста";
        sauce = "Томатный соус";

        toppings.add("Салями Пепперони");
        toppings.add("Сыр Моцарелла");
    }
}
