package com.emramirez.pizzastore.simplefactory;

import com.emramirez.pizzastore.common.Pizza;

public class VeggiePizza extends Pizza {

    public VeggiePizza() {
        name = "NY Style Sauce and Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated mushrooms");
    }
}
