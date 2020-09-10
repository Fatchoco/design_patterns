package com.observer.java.pull;

public interface IObserver {
    public void update(float temperature, float humidity, float pressure);
}
