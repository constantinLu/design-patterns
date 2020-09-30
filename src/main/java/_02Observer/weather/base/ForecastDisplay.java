package _02Observer.weather.base;

import _02Observer.weather.interfaces.DisplayElement;
import _02Observer.weather.interfaces.Observer;
import _02Observer.weather.interfaces.Subject;


public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;

    private float lastPressure;

    private Subject weatherData;


    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerDisplay(this);
    }

    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
