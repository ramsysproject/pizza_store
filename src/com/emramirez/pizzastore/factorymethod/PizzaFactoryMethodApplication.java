package com.emramirez.pizzastore.factorymethod;

import com.emramirez.pizzastore.factorymethod.service.ChicagoPizzaStore;
import com.emramirez.pizzastore.factorymethod.service.NYPizzaStore;
import com.emramirez.pizzastore.factorymethod.service.PizzaStore;
import com.emramirez.pizzastore.common.Pizza;

public class PizzaFactoryMethodApplication {

    public static void main(String... args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());
        System.out.println();
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
