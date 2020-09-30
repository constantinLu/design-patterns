package _04FactoryPattern._01SimpleFactory.notadesignPattern.stores;

public class PizzaSimulator {

    public static void main(String[] args) {

        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("pepperoni");


    }
}
