package patterns.factory.factory_method.example1.creator;

import patterns.factory.factory_method.example1.product.pizza.PizzaType;
import patterns.factory.factory_method.example1.product.pizza.Pizza;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(PizzaType type);

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
