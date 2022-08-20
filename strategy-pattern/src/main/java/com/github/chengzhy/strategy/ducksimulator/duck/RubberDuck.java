package com.github.chengzhy.strategy.ducksimulator.duck;

import com.github.chengzhy.strategy.ducksimulator.behavior.FlyNoWay;
import com.github.chengzhy.strategy.ducksimulator.behavior.Squeak;

/**
 * 橡皮鸭
 *
 * @author chengzhy
 * @date 2022/8/20 22:18
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    /**
     * 外观
     */
    @Override
    public void display() {
        System.out.println("RubberDuck");
    }
}
