package store;

import factory.NYPizzaIngredientFactory;
import pizza.NYStyleCheesePizza;
import pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new NYStyleCheesePizza(new NYPizzaIngredientFactory());
		}
		return pizza;
	}
}
