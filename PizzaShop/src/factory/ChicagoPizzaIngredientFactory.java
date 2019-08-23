package factory;

import ingredient.Cheese;
import ingredient.Clam;
import ingredient.Dough;
import ingredient.Pepperoni;
import ingredient.Sauce;
import ingredient.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new Dough("Thick Crust");
	}

	@Override
	public Sauce createSauce() {
		return new Sauce("Plum Tomato Sauce");
	}

	@Override
	public Cheese createCheese() {
		return new Cheese("Mozzarella Cheese");
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = {
				new Veggies("Black Olive"),
				new Veggies("Spinach"),
				new Veggies("Egg Plant")
		};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new Pepperoni("Sliced Pepperoni");
	}

	@Override
	public Clam createClam() {
		return new Clam("Frozen Clam");
	}
}
