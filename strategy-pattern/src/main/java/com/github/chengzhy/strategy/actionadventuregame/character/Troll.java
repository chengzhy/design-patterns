package com.github.chengzhy.strategy.actionadventuregame.character;

import com.github.chengzhy.strategy.actionadventuregame.behavior.AxeBehavior;

/**
 * 山精角色
 *
 * @author chengzhy
 * @date 2022/8/21 14:58
 */
public class Troll extends Character {
    public Troll() {
        this.weaponBehavior = new AxeBehavior();
    }

    /**
     * 战斗
     */
    @Override
    public void fight() {
        System.out.println("Troll fight!");
    }
}
