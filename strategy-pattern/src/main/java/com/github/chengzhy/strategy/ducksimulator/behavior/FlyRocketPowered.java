package com.github.chengzhy.strategy.ducksimulator.behavior;

/**
 * 火箭动力飞行行为
 *
 * @author chengzhy
 * @date 2022/8/21 11:39
 */
public class FlyRocketPowered implements FlyBehavior {
    /**
     * 火箭动力飞行动作
     */
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
