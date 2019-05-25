package com.emramirez.pizzastore.abstractfactory.model.store;

import com.emramirez.pizzastore.abstractfactory.model.pizza.Pizza;

/**
 * This allows us to keep the order pizza structure consistent across Pizza Stores, only allowing to implement the
 * create pizza method. NY Pizzas can be different than Chicago Pizzas, but we want the process to be kept the same,
 * preparing, baking, cutting and boxing the pizza.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * The factory method
     * @param type the pizza type
     * @return an instance of Pizza
     */
    abstract Pizza createPizza(String type);
}
