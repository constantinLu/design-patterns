package _02Observer.weather;

import _02Observer.weather.base.*;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeassurements(34, 65, 30.2f);
    }
}
