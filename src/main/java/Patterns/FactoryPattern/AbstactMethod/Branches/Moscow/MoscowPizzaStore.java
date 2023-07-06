package Patterns.FactoryPattern.AbstactMethod.Branches.Moscow;

import Patterns.FactoryPattern.AbstactMethod.Pizza.*;
import Patterns.FactoryPattern.AbstactMethod.PizzaIngredient.PizzaIngredientFactory;
import Patterns.FactoryPattern.AbstactMethod.PizzaStore.PizzaStore;

public class MoscowPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new MoscowPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Московская Сырная пицца");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Московская Пицца с пепперони");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Московская Пицца с моллюсками");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Московская Вегетарианская пицца");
        }
        return pizza;
    }
}
