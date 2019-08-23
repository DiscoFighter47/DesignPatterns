
import pizza.Pizza;
import store.ChicagoPizzaStore;
import store.NYPizzaStore;
import store.PizzaStore;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.toString() + "\n");
		
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.toString() + "\n");
	}
}
