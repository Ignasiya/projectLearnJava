package Patterns.FactoryPattern.FactoryMethod.Pizza.SPStyle;

import Patterns.FactoryPattern.FactoryMethod.Pizza.Pizza;

public class SPStylePepperoniPizza extends Pizza {
    public SPStylePepperoniPizza() {
        name = "Питерская Пицца с пепперони";
        dough = "Тонкий лист хрустящего теста";
        sauce = "Томатный соус";

        toppings.add("Салями Пепперони");
        toppings.add("Сыр Моцарелла");
    }
}
