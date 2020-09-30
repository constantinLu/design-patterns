package _02Observer.weatherAPI.base;

import _02Observer.weather.interfaces.DisplayElement;

import java.util.Observable;
import java.util.Observer;


public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;

    private float humidity;

    private Observable weatherData;

    public CurrentConditionDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof  WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current condition: " + temperature + " C degrees and " + humidity + "  % humidity");
    }


}
