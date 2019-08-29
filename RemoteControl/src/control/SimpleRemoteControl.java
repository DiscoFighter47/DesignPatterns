package control;

import command.Command;

public class SimpleRemoteControl {
	private Command slot;
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void pressButton() {
		slot.execute();
	}
	
	public void undoButton() {
		slot.undo();
	}
}
