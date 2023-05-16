package com.mf.observer.impl;

import java.util.ArrayList;
import java.util.List;

import com.mf.observer.Observer;
import com.mf.observer.Subject;
import com.mf.observer.WeatherData;

public class WeatherStation implements Subject {
    private List<Observer> observers;
    private WeatherData weatherData;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weatherData);
        }
    }

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
        notifyObservers();
    }
}
