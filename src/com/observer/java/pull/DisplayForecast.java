package com.observer.java.pull;

import java.util.Observable;
import java.util.Observer;

public class DisplayForecast implements Observer, IDisplay {
    private float temperature;
    private float humidity;
    private float pressure;
    private Observable observable;

    public DisplayForecast(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Forecast is %f %f %f.\n", this.temperature, this.humidity, this.pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData wd = (WeatherData) o;
            this.temperature = wd.getTemperature();
            this.humidity = wd.getHumidity();
            this.pressure = wd.getPressure();
            display();
        }
    }
}
