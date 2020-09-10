package com.observer.manual;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject{
    private List<IObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver o) {
        this.observers.add(o);
    }

    @Override
    public void unregisterObserver(IObserver o) {
        int i = this.observers.indexOf(o);
        if (i >= 0) {
            this.observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for(IObserver o: this.observers) {
            o.update(this.temperature, this.pressure, this.humidity);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
