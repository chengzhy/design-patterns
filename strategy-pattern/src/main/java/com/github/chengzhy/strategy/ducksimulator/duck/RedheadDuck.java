package com.github.chengzhy.strategy.ducksimulator.duck;

import com.github.chengzhy.strategy.ducksimulator.behavior.FlyWithWings;
import com.github.chengzhy.strategy.ducksimulator.behavior.Quack;

/**
 * 红头鸭
 *
 * @author chengzhy
 * @date 2022/8/20 22:17
 */
public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    /**
     * 外观
     */
    @Override
    public void display() {
        System.out.println("RedheadDuck");
    }
}
