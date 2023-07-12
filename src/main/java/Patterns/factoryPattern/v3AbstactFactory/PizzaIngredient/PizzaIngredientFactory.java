package Patterns.factoryPattern.v3AbstactFactory.PizzaIngredient;

import Patterns.factoryPattern.v3AbstactFactory.Ingredient.*;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
}
