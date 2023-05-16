package com.mf.observer.impl;

import com.mf.observer.Observer;
import com.mf.observer.WeatherData;

public class WeatherDisplay implements Observer {
    private WeatherData weatherData;

    @Override
    public void update(WeatherData weatherData) {
        this.weatherData = weatherData;
        display();
    }

    public WeatherData getWeatherData() {
		return weatherData;
	}

	public void display() {
        System.out.println("Temperature: " + weatherData.getTemperature());
        System.out.println("Humidity: " + weatherData.getHumidity());
        System.out.println("Pressure: " + weatherData.getPressure());
    }
}
