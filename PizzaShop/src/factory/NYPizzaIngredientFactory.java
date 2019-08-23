package factory;

import ingredient.Cheese;
import ingredient.Clam;
import ingredient.Dough;
import ingredient.Pepperoni;
import ingredient.Sauce;
import ingredient.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new Dough("Thin Crust");
	}

	@Override
	public Sauce createSauce() {
		return new Sauce("Marinara Sauce");
	}

	@Override
	public Cheese createCheese() {
		return new Cheese("Reggiano Cheese");
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = {
				new Veggies("Garlic"),
				new Veggies("Onion"),
				new Veggies("Mashroom"),
				new Veggies("RedPepper")
		};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new Pepperoni("Sliced Pepperoni");
	}

	@Override
	public Clam createClam() {
		return new Clam("Fresh Clam");
	}
}
