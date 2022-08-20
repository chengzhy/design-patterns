package com.github.chengzhy.strategy.ducksimulator;

import com.github.chengzhy.strategy.ducksimulator.behavior.FlyNoWay;
import com.github.chengzhy.strategy.ducksimulator.behavior.MuteQuack;
import com.github.chengzhy.strategy.ducksimulator.duck.Duck;
import com.github.chengzhy.strategy.ducksimulator.duck.MallardDuck;

/**
 * 鸭子模拟器
 *
 * @author chengzhy
 * @date 2022/8/20 22:15
 */
public class DuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
        mallard.setQuackBehavior(new MuteQuack());
        mallard.performQuack();
    }

}
