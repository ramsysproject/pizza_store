package com.emramirez.pizzastore.simplefactory;

import com.emramirez.pizzastore.common.Pizza;

public class ClamPizza extends Pizza {

    public ClamPizza() {
        name = "NY Style Sauce and Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
