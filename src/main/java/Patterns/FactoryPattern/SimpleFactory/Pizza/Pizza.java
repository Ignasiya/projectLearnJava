package Patterns.FactoryPattern.SimpleFactory.Pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Подготовка " + name);
        System.out.println("Перемешивание теста...");
        System.out.println("Добавление соуса...");
        System.out.println("Добавление начинок: ");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }

    public void bake() {
        System.out.println("Выпекайте 25 минут при температуре 350");
    }

    public void cut() {
        System.out.println("Нарезаем пиццу диагональными ломтиками");
    }

    public void box() {
        System.out.println("Положите пиццу в официальную коробку пиццерии");
    }

    public String getName() {
        return name;
    }
}
