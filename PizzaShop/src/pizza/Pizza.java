package pizza;

import ingredient.Cheese;
import ingredient.Clam;
import ingredient.Dough;
import ingredient.Pepperoni;
import ingredient.Sauce;
import ingredient.Veggies;

public abstract class Pizza {
	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Veggies veggies[];
	protected Cheese cheese;
	protected Pepperoni pepperoni;
	protected Clam clam;
	
	public abstract void prepare();
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		String description = getName();
		if(dough != null) {
			description += " " + dough.getType();
		}
		if(sauce != null) {
			description += " " + sauce.getType();
		}
		return description;
	}
}
