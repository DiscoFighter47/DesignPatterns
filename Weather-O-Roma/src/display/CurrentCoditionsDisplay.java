package display;

import java.util.Observable;
import java.util.Observer;

import weatherData.WeatherData;

public class CurrentCoditionsDisplay implements Display, Observer {
	private float tempereture;
	private float humidity;

	@Override
	public void display() {
		System.out.println("Current Condition: " + tempereture + "F degrees and humidity " + humidity);
	}

	@Override
	public void update(Observable o, Object arg) {
		WeatherData data = (WeatherData)o;
		this.tempereture = data.getTemperature();
		this.humidity = data.getHumidity();
		display();
	}
}
