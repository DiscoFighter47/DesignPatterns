public class MiniDuckSimulator {

	public static void main(String[] args) {
		duck.Duck mallard = new duck.MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		duck.Duck model = new duck.ModelDuck();
		model.performFly();
		model.setFlyBehavior(new fly.FlyRocketPowerd());
		model.performFly();
	}
}
