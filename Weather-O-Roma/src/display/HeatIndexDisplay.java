package display;

import java.util.Observable;
import java.util.Observer;

import weatherData.WeatherData;

public class HeatIndexDisplay implements Display, Observer {
	private float heatIndex;

	@Override
	public void display() {
		System.out.println("Heat index is " + heatIndex);
	}

	@Override
	public void update(Observable o, Object arg) {
		WeatherData data = (WeatherData)o;
		heatIndex = data.getTemperature() + data.getHumidity() + data.getPressure();
		display();
	}
}
