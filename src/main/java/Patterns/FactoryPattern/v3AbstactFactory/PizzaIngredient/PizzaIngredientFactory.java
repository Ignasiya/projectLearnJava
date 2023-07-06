package Patterns.FactoryPattern.v3AbstactFactory.PizzaIngredient;

import Patterns.FactoryPattern.v3AbstactFactory.Ingredient.*;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
}
