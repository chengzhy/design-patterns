package com.github.chengzhy.observer.weatherstation.display;

import com.github.chengzhy.observer.weatherstation.Observer;
import com.github.chengzhy.observer.weatherstation.Subject;
import com.github.chengzhy.observer.weatherstation.display.DisplayElement;

import java.util.Objects;

/**
 * 统计布告板
 *
 * @author chengzhy
 * @date 2022/9/11 20:15
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        if (Objects.isNull(weatherData)) {
            throw new NullPointerException();
        }
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * 布告板展示
     */
    @Override
    public void display() {
        System.out.println("Avg = " + (temperature + humidity + pressure) / 3);
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
        this.pressure = pressure;
        display();
    }
}
