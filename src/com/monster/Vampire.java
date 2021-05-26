package com.monster;

public class Vampire extends Monster{

    public Vampire(){
        super(MonsterType.VAMPIRE);
    }

    @Override
    public int attack(){
        int bite=Util.getRandom(0,1);
        if(bite==1){
            int healthToGain=Util.getRandom(5,10);
            increaseHealth(healthToGain);
            System.out.println("Nice neck Monster to bite I've gained " + healthToGain + " points of health ");
        }
       return super.attack();
    }
}
