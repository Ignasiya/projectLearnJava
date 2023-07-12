package Patterns.factoryPattern.v3AbstactFactory.Pizza;

import Patterns.factoryPattern.v3AbstactFactory.PizzaIngredient.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Подготовка " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}