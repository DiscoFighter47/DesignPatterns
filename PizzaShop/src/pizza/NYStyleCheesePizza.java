package pizza;

import factory.PizzaIngredientFactory;

public class NYStyleCheesePizza extends Pizza {
	private PizzaIngredientFactory ingredientFactory;
	
	public NYStyleCheesePizza(PizzaIngredientFactory factory) {
		this.ingredientFactory = factory;
	}

	@Override
	public void prepare() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}
