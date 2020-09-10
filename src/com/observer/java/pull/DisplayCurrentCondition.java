package com.observer.java.pull;

import java.util.Observable;
import java.util.Observer;

public class DisplayCurrentCondition implements Observer, IDisplay {
    private float temperature;
    private float humidity;
    private Observable observable;

    public DisplayCurrentCondition(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Current condition: %.2fF degrees and %.2f humidity.\n", this.temperature, this.humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData wd = (WeatherData) o;
            this.temperature = wd.getTemperature();
            this.humidity = wd.getHumidity();
            display();
        }
    }
}
