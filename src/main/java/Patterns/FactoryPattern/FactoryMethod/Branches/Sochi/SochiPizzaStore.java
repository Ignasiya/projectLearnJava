package Patterns.FactoryPattern.FactoryMethod.Branches.Sochi;

import Patterns.FactoryPattern.FactoryMethod.Branches.Moscow.MoscowPizzaIngredientFactory;
import Patterns.FactoryPattern.FactoryMethod.Pizza.*;
import Patterns.FactoryPattern.FactoryMethod.PizzaIngredient.PizzaIngredientFactory;
import Patterns.FactoryPattern.FactoryMethod.PizzaStore.PizzaStore;

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
