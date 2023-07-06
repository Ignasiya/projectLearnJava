package Patterns.FactoryPattern.FactoryMethod.Branches.SaintPetersburg;

import Patterns.FactoryPattern.FactoryMethod.Branches.SaintPetersburg.SPIngredients.*;
import Patterns.FactoryPattern.FactoryMethod.Branches.Shared.*;
import Patterns.FactoryPattern.FactoryMethod.Ingredient.*;
import Patterns.FactoryPattern.FactoryMethod.PizzaIngredient.PizzaIngredientFactory;

public class SPPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new SPDough();
    }

    @Override
    public Sauce createSauce() {
        return new SPSauce();
    }

    @Override
    public Cheese createCheese() {
        return new SPCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SPPepperoni();
    }

    @Override
    public Clam createClam() {
        return new SPClam();
    }
}
