package Patterns.FactoryPattern.v1SimpleFactory.Pizza;

public class VeggiePizza extends Pizza{
    public VeggiePizza() {
        name = "Вегетарианская пицца";
        dough = "Тесто для пиццы";
        sauce = "Томатный соус";

        toppings.add("Лук");
        toppings.add("Сыр Моцарелла");
    }
}
