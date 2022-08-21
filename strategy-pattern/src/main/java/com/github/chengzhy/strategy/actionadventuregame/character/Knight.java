package com.github.chengzhy.strategy.actionadventuregame.character;

import com.github.chengzhy.strategy.actionadventuregame.behavior.BowAndArrowBehavior;

/**
 * 骑士角色
 *
 * @author chengzhy
 * @date 2022/8/21 14:57
 */
public class Knight extends Character {
    public Knight() {
        this.weaponBehavior = new BowAndArrowBehavior();
    }

    /**
     * 战斗
     */
    @Override
    public void fight() {
        System.out.println("Knight fight!");
    }
}
