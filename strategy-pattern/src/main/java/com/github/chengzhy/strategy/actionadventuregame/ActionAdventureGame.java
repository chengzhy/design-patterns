package com.github.chengzhy.strategy.actionadventuregame;

import com.github.chengzhy.strategy.actionadventuregame.behavior.AxeBehavior;
import com.github.chengzhy.strategy.actionadventuregame.character.Character;
import com.github.chengzhy.strategy.actionadventuregame.character.King;

/**
 * 动作冒险游戏
 *
 * @author chengzhy
 * @date 2022/8/21 15:01
 */
public class ActionAdventureGame {

    public static void main(String[] args) {
        Character king = new King();
        king.fight();
        king.performWeapon();
        king.setWeaponBehavior(new AxeBehavior());
        king.performWeapon();
    }

}
