package _02Observer.weather.base;

import _02Observer.weather.interfaces.Observer;
import _02Observer.weather.interfaces.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;

    private float temperature;

    private float humidity;

    private float pressure;


    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerDisplay(Observer o) {
        observers.add(o);
    }

    public void removeDisplay(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyDisplay() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyDisplay();
    }

    public void setMeassurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}

