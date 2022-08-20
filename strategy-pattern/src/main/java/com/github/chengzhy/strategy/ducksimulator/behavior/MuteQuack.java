package com.github.chengzhy.strategy.ducksimulator.behavior;

/**
 * 不出声行为
 *
 * @author chengzhy
 * @date 2022/8/20 22:13
 */
public class MuteQuack implements QuackBehavior {
    /**
     * 不出声动作
     */
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
