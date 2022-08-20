package com.github.chengzhy.strategy.ducksimulator.behavior;

/**
 * 吱吱叫行为
 *
 * @author chengzhy
 * @date 2022/8/20 22:12
 */
public class Squeak implements QuackBehavior {
    /**
     * 吱吱叫动作
     */
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
