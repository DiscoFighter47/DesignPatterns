package machine;

import state.HasQuarterState;
import state.NoQuarterState;
import state.SoldOutState;
import state.SoldState;
import state.State;
import state.WinnerState;

public class GumballMachine {
	private NoQuarterState noQuarterState;
	private HasQuarterState hasQuarterState;
	private SoldState soldState;
	private WinnerState winnerState;
	private SoldOutState soldOutState;
	
	private State state;
	private int count = 0;
	
	public GumballMachine(int numGumballs) {
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		soldOutState = new SoldOutState();
		
		count = numGumballs;
		if (count > 0) {
			state = noQuarterState;
		}
	}
	
	public NoQuarterState getNoQuarterState() {
		return noQuarterState;
	}

	public void setNoQuarterState(NoQuarterState noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public HasQuarterState getHasQuarterState() {
		return hasQuarterState;
	}

	public void setHasQuarterState(HasQuarterState hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public SoldState getSoldState() {
		return soldState;
	}

	public void setSoldState(SoldState soldState) {
		this.soldState = soldState;
	}

	public WinnerState getWinnerState() {
		return winnerState;
	}

	public void setWinnerState(WinnerState winnerState) {
		this.winnerState = winnerState;
	}

	public SoldOutState getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(SoldOutState soldOutState) {
		this.soldOutState = soldOutState;
	}

	public int getCount() {
		return count;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	public void releaseBall() {
		if (count > 0) {
			System.out.println("A gumball comes rolling out the slot...");
			count--;
		}
	}
}
