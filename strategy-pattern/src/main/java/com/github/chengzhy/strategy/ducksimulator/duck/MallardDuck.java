package com.github.chengzhy.strategy.ducksimulator.duck;

import com.github.chengzhy.strategy.ducksimulator.behavior.FlyWithWings;
import com.github.chengzhy.strategy.ducksimulator.behavior.Quack;

/**
 * 野鸭
 *
 * @author chengzhy
 * @date 2022/8/20 22:16
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    /**
     * 外观
     */
    @Override
    public void display() {
        System.out.println("MallardDuck");
    }
}
