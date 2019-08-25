import boiler.ChocolateBoiler;

public class ChocolateFactories {

	public static void main(String[] args) {
		ChocolateBoiler.getInstance().fill();
		ChocolateBoiler.getInstance().boil();
		ChocolateBoiler.getInstance().drain();
	}
}
