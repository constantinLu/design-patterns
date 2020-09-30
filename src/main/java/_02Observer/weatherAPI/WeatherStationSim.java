package _02Observer.weatherAPI;

import _02Observer.weatherAPI.base.*;

public class WeatherStationSim {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        GeneralDisplay generalDisplay = new GeneralDisplay(weatherData);
        CurrentConditionDisplay currentConditions = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);


        weatherData.setMeassurements(80, 65, 30.4f);
        weatherData.setMeassurements(82, 70, 29.2f);
        weatherData.setMeassurements(78, 90, 29.2f);
    }
}

