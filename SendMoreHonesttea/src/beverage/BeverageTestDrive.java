package beverage;

public class BeverageTestDrive {

	public static void main(String[] args) {
		System.out.println("Making tea...");
		Tea tea = new Tea();
		tea.prepareRecipe();
		
		System.out.println("Making coffee...");
		Coffee coffee = new Coffee();
		coffee.prepareRecipe();
	}
}
