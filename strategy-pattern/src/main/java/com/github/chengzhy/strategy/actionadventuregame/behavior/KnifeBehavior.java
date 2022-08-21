package com.github.chengzhy.strategy.actionadventuregame.behavior;

/**
 * 使用匕首行为
 *
 * @author chengzhy
 * @date 2022/8/21 14:47
 */
public class KnifeBehavior implements WeaponBehavior {
    /**
     * 使用匕首动作
     */
    @Override
    public void useWeapon() {
        System.out.println("use knife!");
    }
}
