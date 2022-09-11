package com.github.chengzhy.observer.weatherstation;

import com.github.chengzhy.observer.weatherstation.display.CurrentConditionsDisplay;
import com.github.chengzhy.observer.weatherstation.display.ForecastDisplay;
import com.github.chengzhy.observer.weatherstation.display.StatisticsDisplay;

/**
 * 气象站
 *
 * @author chengzhy
 * @date 2022/9/11 20:13
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80f, 65f, 30.4f);
        weatherData.setMeasurements(82f, 70f, 29.2f);
        weatherData.setMeasurements(78f, 90f, 29.2f);
    }
}
