package com.monster;

public enum MonsterType {

    WEREWOLF(10),
    VAMPIRE(20),
    MUMMY(15);
    int damageCaused;
    MonsterType(int damageCaused){
        this.damageCaused=damageCaused;
    }


}
