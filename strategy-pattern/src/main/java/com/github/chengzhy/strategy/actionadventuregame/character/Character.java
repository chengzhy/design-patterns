package com.github.chengzhy.strategy.actionadventuregame.character;

import com.github.chengzhy.strategy.actionadventuregame.behavior.WeaponBehavior;

/**
 * 角色抽象类
 *
 * @author chengzhy
 * @date 2022/8/21 14:42
 */
public abstract class Character {
    WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    /**
     * 战斗
     */
    public abstract void fight();

    public void performWeapon() {
        weaponBehavior.useWeapon();
    }
}
