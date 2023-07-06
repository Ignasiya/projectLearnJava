package Patterns.FactoryPattern.v3AbstactFactory.Branches.Sochi;

import Patterns.FactoryPattern.v3AbstactFactory.Branches.Shared.*;
import Patterns.FactoryPattern.v3AbstactFactory.Branches.Sochi.SochiIngredients.*;
import Patterns.FactoryPattern.v3AbstactFactory.Ingredient.*;
import Patterns.FactoryPattern.v3AbstactFactory.PizzaIngredient.PizzaIngredientFactory;

public class SochiPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new SochiDough();
    }

    @Override
    public Sauce createSauce() {
        return new SochiSauce();
    }

    @Override
    public Cheese createCheese() {
        return new SochiCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SochiPepperoni();
    }

    @Override
    public Clam createClam() {
        return new SochiClam();
    }
}
