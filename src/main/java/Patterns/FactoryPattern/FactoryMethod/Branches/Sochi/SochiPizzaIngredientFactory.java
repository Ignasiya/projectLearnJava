package Patterns.FactoryPattern.FactoryMethod.Branches.Sochi;

import Patterns.FactoryPattern.FactoryMethod.Branches.Shared.*;
import Patterns.FactoryPattern.FactoryMethod.Branches.Sochi.SochiIngredients.*;
import Patterns.FactoryPattern.FactoryMethod.Ingredient.*;
import Patterns.FactoryPattern.FactoryMethod.PizzaIngredient.PizzaIngredientFactory;

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
