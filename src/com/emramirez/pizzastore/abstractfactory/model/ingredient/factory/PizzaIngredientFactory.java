package com.emramirez.pizzastore.abstractfactory.model.ingredient.factory;

import com.emramirez.pizzastore.abstractfactory.model.ingredient.*;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
