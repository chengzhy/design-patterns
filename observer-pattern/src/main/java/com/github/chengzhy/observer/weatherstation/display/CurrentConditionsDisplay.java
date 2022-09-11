package com.github.chengzhy.observer.weatherstation.display;

import com.github.chengzhy.observer.weatherstation.Observer;
import com.github.chengzhy.observer.weatherstation.Subject;

import java.util.Objects;

/**
 * 目前状况布告板
 *
 * @author chengzhy
 * @date 2022/9/11 20:07
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        if (Objects.isNull(weatherData)) {
            throw new NullPointerException();
        }
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * 布告板展示(最近的温度和湿度)
     */
    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature
                + "F degress and " + humidity + "% humidity");
    }

    /**
     * 更新
     *
     * @param temperature 温度
     * @param humidity    湿度
     * @param pressure    气压
     */
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
