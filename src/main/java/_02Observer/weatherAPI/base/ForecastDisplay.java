package _02Observer.weatherAPI.base;

import _02Observer.weather.interfaces.DisplayElement;
import _02Observer.weather.interfaces.Subject;

import java.util.Observable;
import java.util.Observer;


public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;

    private float lastPressure;

    private Observable observable;


    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
        }
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
