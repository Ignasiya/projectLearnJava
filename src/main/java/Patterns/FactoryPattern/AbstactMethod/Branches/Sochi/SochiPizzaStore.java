package Patterns.FactoryPattern.AbstactMethod.Branches.Sochi;

import Patterns.FactoryPattern.AbstactMethod.Pizza.*;
import Patterns.FactoryPattern.AbstactMethod.PizzaIngredient.PizzaIngredientFactory;
import Patterns.FactoryPattern.AbstactMethod.PizzaStore.PizzaStore;

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
