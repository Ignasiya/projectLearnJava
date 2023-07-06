package Patterns.FactoryPattern.FactoryMethod.PizzaIngredient;

import Patterns.FactoryPattern.FactoryMethod.Ingredient.*;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
}
