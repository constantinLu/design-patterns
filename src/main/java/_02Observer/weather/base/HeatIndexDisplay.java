package _02Observer.weather.base;

import _02Observer.weather.interfaces.DisplayElement;
import _02Observer.weather.interfaces.Observer;
import _02Observer.weather.interfaces.Subject;

public class HeatIndexDisplay implements Observer, DisplayElement {

    private float temp;

    private float humidity;

    private Subject weatherData;

    public HeatIndexDisplay(Subject weatherData) {
       this.weatherData = weatherData;
       weatherData.registerDisplay(this);
    }

    private float computeHeatIndex(float temp, float humidity) {
        float index = (float)((16.923 + (0.185212 * temp) + (5.37941 * humidity) - (0.100254 * temp * humidity) +
                (0.00941695 * (temp * temp)) + (0.00728898 * (humidity * humidity)) +
                (0.000345372 * (temp * temp * humidity)) - (0.000814971 * (temp * humidity * humidity)) +
                (0.0000102102 * (temp * temp * humidity * humidity)) - (0.000038646 * (temp * temp * temp)) + (0.0000291583 *
                (humidity * humidity * humidity)) + (0.00000142721 * (temp * temp * temp * humidity)) +
                (0.000000197483 * (temp * humidity * humidity * humidity)) - (0.0000000218429 * (temp * temp * temp * humidity * humidity)) +
                0.000000000843296 * (temp * temp * humidity * humidity * humidity)) -
                (0.0000000000481975 * (temp * temp * temp * humidity * humidity * humidity)));
        return index;
    }

    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }


    public void display() {
        System.out.println("Heat index is :  " + computeHeatIndex(temp, humidity) + " % " );
    }
}
