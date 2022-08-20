package com.github.chengzhy.strategy.ducksimulator.duck;

import com.github.chengzhy.strategy.ducksimulator.behavior.FlyNoWay;
import com.github.chengzhy.strategy.ducksimulator.behavior.MuteQuack;

/**
 * 诱饵鸭
 *
 * @author chengzhy
 * @date 2022/8/20 22:20
 */
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    /**
     * 外观
     */
    @Override
    public void display() {
        System.out.println("DecoyDuck");
    }
}
