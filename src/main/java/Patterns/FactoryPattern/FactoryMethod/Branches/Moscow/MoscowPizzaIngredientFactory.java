package Patterns.FactoryPattern.FactoryMethod.Branches.Moscow;

import Patterns.FactoryPattern.FactoryMethod.Branches.Moscow.MoscowIngredients.*;
import Patterns.FactoryPattern.FactoryMethod.Branches.Shared.*;
import Patterns.FactoryPattern.FactoryMethod.Ingredient.*;
import Patterns.FactoryPattern.FactoryMethod.PizzaIngredient.PizzaIngredientFactory;

public class MoscowPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new MoscowDough();
    }

    @Override
    public Sauce createSauce() {
        return new MoscowSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MoscowCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new MoscowPepperoni();
    }

    @Override
    public Clam createClam() {
        return new MoscowClam();
    }
}
