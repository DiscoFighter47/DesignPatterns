package beverage;

public abstract class CaffeineBeverage {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
		 
	}
	
	public final void boilWater() {
		System.out.println("Boiling water");
	}
	
	public final void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	public boolean customerWantsCondiments() {
		return true;
	}
	
	abstract void brew();
	abstract void addCondiments();
}
