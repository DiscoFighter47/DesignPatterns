
import appliances.Light;
import appliances.Stereo;
import appliances.TV;
import command.Command;
import command.LightOnCommand;
import command.MacroCommand;
import command.StereoOnCommand;
import command.TVOnCommand;
import control.SimpleRemoteControl;

public class RemoteControlTest {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		Light light = new Light("Living Room");
		Command lightOn = new LightOnCommand(light);
		
		TV tv = new TV("Living Room");
		Command tvOn = new TVOnCommand(tv);
		
		Stereo stereo = new Stereo("Living Room");
		Command stereoOn = new StereoOnCommand(stereo);
		
		Command[] partyOn = { lightOn, tvOn, stereoOn,};
		Command partyOnMacro = new MacroCommand(partyOn);
		
		remote.setCommand(partyOnMacro);
		remote.pressButton();
		remote.undoButton();
	}
}
