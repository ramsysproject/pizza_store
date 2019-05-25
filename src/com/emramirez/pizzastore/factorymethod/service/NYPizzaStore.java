package com.emramirez.pizzastore.factorymethod.service;

import com.emramirez.pizzastore.factorymethod.model.NYStyleCheesePizza;
import com.emramirez.pizzastore.factorymethod.model.NYStyleClamPizza;
import com.emramirez.pizzastore.factorymethod.model.NYStylePepperoniPizza;
import com.emramirez.pizzastore.factorymethod.model.NYStyleVeggiePizza;
import com.emramirez.pizzastore.common.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        }
        return null;
    }
}
