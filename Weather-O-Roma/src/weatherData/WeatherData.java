package weatherData;

import java.util.Observable;

public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	
	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setMeasurements(float tempareture, float humidity, float pressure) {
		this.temperature = tempareture;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	private void measurementsChanged() {
		setChanged();
		notifyObservers(null);
	}
}
