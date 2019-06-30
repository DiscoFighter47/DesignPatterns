package duck;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		flyBehavior = new fly.FlyWithWings();
		quackBehavior = new quack.Quack();
	}

	@Override
	public void display() {
		System.out.println("i'm a real mallard duck");
	}

}
