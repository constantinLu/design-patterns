package _04FactoryPattern._01SimpleFactory.notadesignPattern.stores;

import _04FactoryPattern._01SimpleFactory.notadesignPattern.pizza.Pizza;
import _04FactoryPattern._01SimpleFactory.notadesignPattern.pizza.chicago.*;
import _04FactoryPattern._01SimpleFactory.notadesignPattern.pizza.ny.*;

public class NYPizzaStore extends PizzaStore {


    Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYPepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new NYClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYVeggiePizza();
        }
        return pizza;
    }
}
