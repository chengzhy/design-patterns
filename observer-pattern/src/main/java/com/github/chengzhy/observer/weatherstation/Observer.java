package com.github.chengzhy.observer.weatherstation;

/**
 * 观察者(布告板)
 *
 * @author chengzhy
 * @date 2022/9/11 19:45
 */
public interface Observer {
    /**
     * 更新
     *
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(float temperature, float humidity, float pressure);
}
