package com.github.chengzhy.strategy.actionadventuregame.behavior;

/**
 * 使用弓箭行为
 *
 * @author chengzhy
 * @date 2022/8/21 14:47
 */
public class BowAndArrowBehavior implements WeaponBehavior {
    /**
     * 使用弓箭动作
     */
    @Override
    public void useWeapon() {
        System.out.println("use bow and arrow!");
    }
}
