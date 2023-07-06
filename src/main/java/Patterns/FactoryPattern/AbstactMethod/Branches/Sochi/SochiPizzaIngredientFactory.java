package Patterns.FactoryPattern.AbstactMethod.Branches.Sochi;

import Patterns.FactoryPattern.AbstactMethod.Branches.Shared.*;
import Patterns.FactoryPattern.AbstactMethod.Branches.Sochi.SochiIngredients.*;
import Patterns.FactoryPattern.AbstactMethod.Ingredient.*;
import Patterns.FactoryPattern.AbstactMethod.PizzaIngredient.PizzaIngredientFactory;

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
