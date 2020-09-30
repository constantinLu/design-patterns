package _04FactoryPattern._01SimpleFactory.notadesignPattern.stores;

import _04FactoryPattern._01SimpleFactory.notadesignPattern.pizza.Pizza;
import _04FactoryPattern._01SimpleFactory.notadesignPattern.pizza.chicago.*;

public class ChicagoPizzaStore extends  PizzaStore {


    Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoPepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoVeggiePizza();
        }
        return pizza;
    }
}
