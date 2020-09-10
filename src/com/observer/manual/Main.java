package com.observer.manual;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        DisplayCurrentCondition d1 = new DisplayCurrentCondition(weatherData);
        DisplayForecast d2 = new DisplayForecast(weatherData);

        weatherData.setMeasurements(10.2f, 20.1f, 30.9f);
        weatherData.setMeasurements(1.2f, 2.1f, 3.9f);
    }
}
