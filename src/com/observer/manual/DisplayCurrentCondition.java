package com.observer.manual;

public class DisplayCurrentCondition implements IObserver, IDisplay {
    private float temperature;
    private float humidity;
    private ISubject weatherData;

    public DisplayCurrentCondition(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Current condition: %.2fF degrees and %.2f humidity.\n", this.temperature, this.humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
