package com.github.chengzhy.strategy.ducksimulator.behavior;

/**
 * 翅膀飞行行为
 *
 * @author chengzhy
 * @date 2022/8/20 21:59
 */
public class FlyWithWings implements FlyBehavior {
    /**
     * 翅膀飞行动作
     */
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
