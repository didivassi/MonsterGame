package com.monster;

public enum MonsterType {

    WEREWOLF(10),
    VAMPIRE(20),
    MUMMY(15);
    int attackPower;
    MonsterType(int attackPower){
        this.attackPower=attackPower;
    }


}
