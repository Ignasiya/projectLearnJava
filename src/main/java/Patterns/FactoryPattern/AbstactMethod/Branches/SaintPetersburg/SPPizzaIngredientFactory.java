package Patterns.FactoryPattern.AbstactMethod.Branches.SaintPetersburg;

import Patterns.FactoryPattern.AbstactMethod.Branches.SaintPetersburg.SPIngredients.*;
import Patterns.FactoryPattern.AbstactMethod.Branches.Shared.*;
import Patterns.FactoryPattern.AbstactMethod.Ingredient.*;
import Patterns.FactoryPattern.AbstactMethod.PizzaIngredient.PizzaIngredientFactory;

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
