package com.github.chengzhy.strategy.ducksimulator.behavior;

/**
 * 呱呱叫行为
 *
 * @author chengzhy
 * @date 2022/8/20 22:09
 */
public class Quack implements QuackBehavior {
    /**
     * 呱呱叫动作
     */
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
