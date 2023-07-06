package Patterns.FactoryPattern.FactoryMethod.Pizza.MoscowStyle;

import Patterns.FactoryPattern.FactoryMethod.Pizza.Pizza;

public class MoscowStylePepperoniPizza extends Pizza {
    public MoscowStylePepperoniPizza() {
        name = "Московская Пицца с пепперони";
        dough = "Тонкий лист хрустящего теста";
        sauce = "Томатный соус";

        toppings.add("Салями Пепперони");
        toppings.add("Сыр Моцарелла");
    }
}
