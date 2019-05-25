package com.emramirez.pizzastore.simplefactory;

import com.emramirez.pizzastore.common.Pizza;

public class CheesePizza extends Pizza {

    public CheesePizza() {
        name = "NY Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }
}
