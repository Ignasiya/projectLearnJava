package Patterns.factoryPattern.v1SimpleFactory.Pizza;

public class ClamPizza extends Pizza{
    public ClamPizza() {
        name = "Пицца с моллюсками";
        dough = "Тесто для пиццы";
        sauce = "Томатный соус";

        toppings.add("Мидии");
        toppings.add("Чеснок");
        toppings.add("Сыр Моцарелла");
    }
}
