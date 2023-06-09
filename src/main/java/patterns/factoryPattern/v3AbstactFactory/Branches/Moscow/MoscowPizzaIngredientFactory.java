package patterns.factoryPattern.v3AbstactFactory.Branches.Moscow;

import patterns.factoryPattern.v3AbstactFactory.Branches.Moscow.MoscowIngredients.*;
import patterns.factoryPattern.v3AbstactFactory.Branches.Shared.*;
import patterns.factoryPattern.v3AbstactFactory.Ingredient.*;
import patterns.factoryPattern.v3AbstactFactory.PizzaIngredient.PizzaIngredientFactory;

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
