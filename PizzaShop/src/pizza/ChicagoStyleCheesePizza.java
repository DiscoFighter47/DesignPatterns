package pizza;

import factory.PizzaIngredientFactory;

public class ChicagoStyleCheesePizza extends Pizza {
private PizzaIngredientFactory ingredientFactory;
	
	public ChicagoStyleCheesePizza(PizzaIngredientFactory factory) {
		this.ingredientFactory = factory;
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

	@Override
	public void prepare() {
		name = "Chicago Style Sauce and Cheese Pizza";
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
	}
}
