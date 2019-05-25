package com.emramirez.pizzastore.abstractfactory.model;

import com.emramirez.pizzastore.abstractfactory.model.pizza.Pizza;
import com.emramirez.pizzastore.abstractfactory.model.store.NYPizzaStore;
import com.emramirez.pizzastore.abstractfactory.model.store.PizzaStore;

public class PizzaAbstractFactoryApplication {

    public static void main(String... args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza.toString());
    }
}
