package _02Observer.weatherAPI.base;

import _02Observer.weather.interfaces.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;

    private Observable observable;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            float currentTemp = weatherData.getTemperature();
            tempSum += currentTemp;
            numReadings++;

            if (currentTemp > maxTemp) {
                maxTemp = currentTemp;
            }

            if (currentTemp < minTemp) {
                minTemp = currentTemp;
            }

            display();
        }
    }

        public void display() {
            System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                    + "/" + maxTemp + "/" + minTemp);
        }
    }
