package com.emramirez.pizzastore.simplefactory;

import com.emramirez.pizzastore.common.Pizza;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza() {
        name = "NY Style Deep Dish Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }
}
