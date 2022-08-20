package com.github.chengzhy.strategy.ducksimulator.behavior;

/**
 * 不会飞行行为
 *
 * @author chengzhy
 * @date 2022/8/20 22:01
 */
public class FlyNoWay implements FlyBehavior {
    /**
     * 不会飞行动作
     */
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
