package com.github.chengzhy.strategy.actionadventuregame.character;

import com.github.chengzhy.strategy.actionadventuregame.behavior.SwordBehavior;

/**
 * 国王角色
 *
 * @author chengzhy
 * @date 2022/8/21 14:53
 */
public class King extends Character {
    public King() {
        this.weaponBehavior = new SwordBehavior();
    }

    /**
     * 战斗
     */
    @Override
    public void fight() {
        System.out.println("King fight!");
    }
}
