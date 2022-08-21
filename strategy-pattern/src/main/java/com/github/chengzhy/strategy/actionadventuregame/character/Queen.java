package com.github.chengzhy.strategy.actionadventuregame.character;

import com.github.chengzhy.strategy.actionadventuregame.behavior.KnifeBehavior;

/**
 * 皇后角色
 *
 * @author chengzhy
 * @date 2022/8/21 14:55
 */
public class Queen extends Character {
    public Queen() {
        this.weaponBehavior = new KnifeBehavior();
    }

    /**
     * 战斗
     */
    @Override
    public void fight() {
        System.out.println("Queen fight!");
    }
}
