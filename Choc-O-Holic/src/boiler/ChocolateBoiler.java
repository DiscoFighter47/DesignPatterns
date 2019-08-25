package boiler;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler instance;
	
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public static synchronized ChocolateBoiler getInstance() {
		if (instance == null) {
			instance = new ChocolateBoiler();
		}
		return instance;
	}
	
	public void fill() {
		if (empty) {
			System.out.println("filling chocolates...");
			empty = false;
			boiled = false;
		}
	}
	
	public void drain() {
		if (boiled) {
			System.out.println("draining chocolates...");
			empty = true;
			boiled = false;
		}
	}
	
	public void boil() {
		if (!empty && !boiled) {
			System.out.println("boiling chocolates...");
			boiled = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
}
