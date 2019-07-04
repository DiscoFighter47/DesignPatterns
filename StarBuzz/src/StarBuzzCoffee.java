import beverage.Beverage;
import beverage.Expresso;
import beverage.HouseBlend;
import condiment.Mocha;

public class StarBuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage1 = new Expresso();
		System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
	}
}
