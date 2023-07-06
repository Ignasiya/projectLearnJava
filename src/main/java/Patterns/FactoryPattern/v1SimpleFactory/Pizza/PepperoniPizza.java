package Patterns.FactoryPattern.v1SimpleFactory.Pizza;

public class PepperoniPizza extends Pizza{
    public PepperoniPizza() {
        name = "Пицца с пепперони";
        dough = "Тонкий лист хрустящего теста";
        sauce = "Томатный соус";

        toppings.add("Салями Пепперони");
        toppings.add("Сыр Моцарелла");
    }
}
