package com.observer.manual;

public class DisplayForecast implements IObserver, IDisplay {
    private float temperature;
    private float humidity;
    private float pressure;
    private ISubject weatherData;

    public DisplayForecast(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Forecast is %f %f %f.\n", this.temperature, this.humidity, this.pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
