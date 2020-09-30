package _02Observer.weatherAPI.base;

import _02Observer.weather.interfaces.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class GeneralDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;

    private Observable observable;

    public  GeneralDisplay(Observable observable) {
        this.observable = observable;
       observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    public void display() {
        System.out.println("General Display - >> Temp: " + temp + " C, Humidity: " + humidity +  " %, Pressure: " + pressure +  " mm Hg");
    }
}
