package appliances;

public class Stereo {
	private String location;
	
	public Stereo(String location) {
		this.location = location;
	}
	
	public void on() {
		System.out.println(location + " stereo is on");
	}
	
	public void off() {
		System.out.println(location + " stereo is off");
	}
}
