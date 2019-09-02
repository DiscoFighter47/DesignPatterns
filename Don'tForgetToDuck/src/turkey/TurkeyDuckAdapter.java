package turkey;

import duck.Duck;

public class TurkeyDuckAdapter implements Duck {
	private Turkey turkey;
	
	public TurkeyDuckAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for(int i=0;i<5;i++) {
			turkey.fly();
		}
	}
}
