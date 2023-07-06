package Patterns.FactoryPattern.v3AbstactFactory.Branches.SaintPetersburg;

import Patterns.FactoryPattern.v3AbstactFactory.Pizza.*;
import Patterns.FactoryPattern.v3AbstactFactory.PizzaIngredient.PizzaIngredientFactory;
import Patterns.FactoryPattern.v3AbstactFactory.PizzaStore.PizzaStore;

public class SPPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new SPPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Питерская Сырная пицца");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Питерская Пицца с пепперони");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Питерская Пицца с моллюсками");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Питерская Вегетарианская пицца");
        }
        return pizza;
    }
}
