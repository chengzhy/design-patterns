package com.github.chengzhy.observer.weatherstation.display;

import com.github.chengzhy.observer.weatherstation.Observer;
import com.github.chengzhy.observer.weatherstation.Subject;

import java.util.Objects;

/**
 * 预测布告板
 *
 * @author chengzhy
 * @date 2022/9/11 20:25
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
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
        if (temperature > 81f) {
            System.out.println("Forecast: attention high!");
        } else if (temperature < 79f) {
            System.out.println("Forecast: attention low!");
        } else {
            System.out.println("Forecast: Improving weather on the way!");
        }
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
