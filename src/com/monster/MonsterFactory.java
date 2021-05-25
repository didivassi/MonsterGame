package com.monster;

public abstract class MonsterFactory {

    public static Monster getRandomMonster(){
        int random=Util.getRandom(0,MonsterType.values().length-1);
        MonsterType randomType= MonsterType.values()[random];
        switch (randomType){
            case WEREWOLF:
                return new Werewolf();
            case MUMMY:
                return new Mummy();
            case VAMPIRE:
            default:
                return new Vampire();
        }
    }
}
