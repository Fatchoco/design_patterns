package com.observer.manual;

public interface ISubject {
    public void registerObserver(IObserver o);
    public void unregisterObserver(IObserver o);
    public void notifyObservers();
}
