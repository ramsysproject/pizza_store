package com.emramirez.pizzastore.factorymethod.service;

import com.emramirez.pizzastore.factorymethod.model.ChicagoStyleCheesePizza;
import com.emramirez.pizzastore.factorymethod.model.ChicagoStyleClamPizza;
import com.emramirez.pizzastore.factorymethod.model.ChicagoStylePepperoniPizza;
import com.emramirez.pizzastore.factorymethod.model.ChicagoStyleVeggiePizza;
import com.emramirez.pizzastore.common.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        }
        return null;
    }
}
