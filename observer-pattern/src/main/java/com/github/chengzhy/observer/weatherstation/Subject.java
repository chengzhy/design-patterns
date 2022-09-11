package com.github.chengzhy.observer.weatherstation;

/**
 * 主题
 *
 * @author chengzhy
 * @date 2022/9/11 19:36
 */
public interface Subject {
    /**
     * 注册观察者
     *
     * @param observer 观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     *
     * @param observer 观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
