package com.github.chengzhy.strategy.ducksimulator.duck;

import com.github.chengzhy.strategy.ducksimulator.behavior.FlyBehavior;
import com.github.chengzhy.strategy.ducksimulator.behavior.QuackBehavior;

/**
 * 鸭子抽象类
 *
 * @author chengzhy
 * @date 2022/8/20 21:41
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     * 游泳
     */
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    /**
     * 外观
     */
    public abstract void display();

    /**
     * 飞行
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * 呱呱叫
     */
    public void performQuack() {
        quackBehavior.quack();
    }
}
