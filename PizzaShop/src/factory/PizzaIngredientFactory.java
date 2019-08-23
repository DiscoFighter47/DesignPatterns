package factory;

import ingredient.Cheese;
import ingredient.Clam;
import ingredient.Dough;
import ingredient.Pepperoni;
import ingredient.Sauce;
import ingredient.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clam createClam();
}
