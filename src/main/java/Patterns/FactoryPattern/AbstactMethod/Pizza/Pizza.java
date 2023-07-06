package Patterns.FactoryPattern.AbstactMethod.Pizza;

import Patterns.FactoryPattern.AbstactMethod.Ingredient.*;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clam clam;

    public abstract void prepare();

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

    public void setName(String name) {
        this.name = name;
    }
}
