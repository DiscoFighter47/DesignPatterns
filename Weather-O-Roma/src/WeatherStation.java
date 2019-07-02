import java.util.Observer;

import display.CurrentCoditionsDisplay;
import display.Display;
import display.HeatIndexDisplay;
import weatherData.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData data  = new WeatherData();
		Display display1 = new CurrentCoditionsDisplay();
		data.addObserver((Observer)display1);
		
		Display display2 =  new HeatIndexDisplay();
		data.addObserver((Observer)display2);
		
		data.setMeasurements(10, 65, 30.4f);
	}
}
