package com.github.chengzhy.strategy.actionadventuregame.behavior;

/**
 * 使用宝剑行为
 *
 * @author chengzhy
 * @date 2022/8/21 14:48
 */
public class SwordBehavior implements WeaponBehavior {
    /**
     * 使用宝剑动作
     */
    @Override
    public void useWeapon() {
        System.out.println("use sword!");
    }
}
