package store;

import factory.ChicagoPizzaIngredientFactory;
import pizza.ChicagoStyleCheesePizza;
import pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza(new ChicagoPizzaIngredientFactory());
		}
		return pizza;
	}
}
