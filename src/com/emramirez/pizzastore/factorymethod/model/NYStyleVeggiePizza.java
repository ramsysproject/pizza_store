package com.emramirez.pizzastore.factorymethod.model;

import com.emramirez.pizzastore.common.Pizza;

public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        name = "NY Style Sauce and Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated mushrooms");
    }
}
