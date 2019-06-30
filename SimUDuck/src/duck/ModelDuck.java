package duck;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		flyBehavior = new fly.FlyNoWay();
		quackBehavior = new quack.MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("i'm a model duck");
	}
}
