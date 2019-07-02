package duck;

import fly.FlyBehavior;
import quack.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public abstract void display();

	public void setFlyBehavior(fly.FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(quack.QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("all ducks float, even decoys!");
	}
}
