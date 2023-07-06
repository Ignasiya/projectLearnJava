package Patterns.FactoryPattern.SimpleFactory.Pizza;

public class CheesePizza extends Pizza{
    public CheesePizza() {
        name = "Сырная пицца";
        dough = "Тесто с тонкой корочкой";
        sauce = "Соус Маринара";

        toppings.add("Сыр Реджано");
    }
}
