package Patterns.FactoryPattern.AbstactMethod.PizzaIngredient;

import Patterns.FactoryPattern.AbstactMethod.Ingredient.*;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
}
