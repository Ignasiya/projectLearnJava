package Patterns.factoryPattern.v3AbstactFactory.Branches.Sochi;

import Patterns.factoryPattern.v3AbstactFactory.Pizza.*;
import Patterns.factoryPattern.v3AbstactFactory.PizzaIngredient.PizzaIngredientFactory;
import Patterns.factoryPattern.v3AbstactFactory.PizzaStore.PizzaStore;

public class SochiPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new SochiPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Сочинская Сырная пицца");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Сочинская Пицца с пепперони");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Сочинская Пицца с моллюсками");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Сочинская Вегетарианская пицца");
        }
        return pizza;
    }
}
