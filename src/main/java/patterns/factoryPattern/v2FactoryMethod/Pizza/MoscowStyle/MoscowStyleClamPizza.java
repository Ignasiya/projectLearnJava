package patterns.factoryPattern.v2FactoryMethod.Pizza.MoscowStyle;

import patterns.factoryPattern.v2FactoryMethod.Pizza.Pizza;

public class MoscowStyleClamPizza extends Pizza {
    public MoscowStyleClamPizza() {
        name = "Московская Пицца с моллюсками";
        dough = "Тесто для пиццы";
        sauce = "Томатный соус";

        toppings.add("Мидии");
        toppings.add("Чеснок");
        toppings.add("Сыр Моцарелла");
    }
}
