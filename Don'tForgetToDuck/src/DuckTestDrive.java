import duck.Duck;
import duck.MallardDuck;
import turkey.Turkey;
import turkey.TurkeyDuckAdapter;
import turkey.WildTurkey;

public class DuckTestDrive {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		System.out.println("The Duck says...");
		testDuck(duck);
		
		Turkey turkey = new WildTurkey();
		Duck turkeyDuck = new TurkeyDuckAdapter(turkey);
		
		System.out.println("The Turkey says...");
		testDuck(turkeyDuck);
	}
	
	public static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
