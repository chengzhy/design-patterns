package com.github.chengzhy.strategy.actionadventuregame.behavior;

/**
 * 使用斧头行为
 *
 * @author chengzhy
 * @date 2022/8/21 14:48
 */
public class AxeBehavior implements WeaponBehavior {
    /**
     * 使用斧头动作
     */
    @Override
    public void useWeapon() {
        System.out.println("use axe!");
    }
}
