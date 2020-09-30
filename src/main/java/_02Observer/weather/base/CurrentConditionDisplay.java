package _02Observer.weather.base;

import _02Observer.weather.interfaces.DisplayElement;
import _02Observer.weather.interfaces.Observer;
import _02Observer.weather.interfaces.Subject;


public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;

    private float humidity;

    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerDisplay(this);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current condition: " + temperature + " C degrees and " + humidity + "  % humidity");
    }
}
