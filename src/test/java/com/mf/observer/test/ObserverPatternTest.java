package com.mf.observer.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.mf.observer.WeatherData;
import com.mf.observer.impl.WeatherDisplay;
import com.mf.observer.impl.WeatherStation;

public class ObserverPatternTest {
    @Test
    void testWeatherDisplayUpdates() {
        WeatherStation weatherStation = new WeatherStation();
        WeatherDisplay display1 = new WeatherDisplay();
        WeatherDisplay display2 = new WeatherDisplay();

        weatherStation.registerObserver(display1);
        weatherStation.registerObserver(display2);

        WeatherData weatherData = new WeatherData(25.0f, 60.0f, 1013.25f);
        weatherStation.setWeatherData(weatherData);

        // Assert that both displays have been updated
        assertEquals(25.0f, display1.getWeatherData().getTemperature());
        assertEquals(25.0f, display2.getWeatherData().getTemperature());

        assertEquals(60.0f, display1.getWeatherData().getHumidity());
        assertEquals(60.0f, display2.getWeatherData().getHumidity());

        assertEquals(1013.25f, display1.getWeatherData().getPressure());
        assertEquals(1013.25f, display2.getWeatherData().getPressure());
    }
}

