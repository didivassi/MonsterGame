package com.monster;

public class Mummy extends Monster{

    private int consecutiveAttacks;
    private final int MAX_CONSECUTIVE_ATTACKS=2;
   //private final int DAMAGE_FOR_MAX_CONSECUTIVE_ATTACKS=5;
    public Mummy(){
        super(MonsterType.MUMMY);
        consecutiveAttacks=0;
    }

    @Override
    public void attack(){
        if(consecutiveAttacks==MAX_CONSECUTIVE_ATTACKS){
            consecutiveAttacks=0;
            int healthToLoose=Util.getRandom(5,10);
            super.decreaseHealth(healthToLoose);
            System.out.println("Can't attack. I'm falling and unrolling... Too much attacks. I've lost " + healthToLoose + " points of health ");
            return;
        }
        super.attack();
        consecutiveAttacks++;
    }

    @Override
    public void defend(Monster attacker){
        consecutiveAttacks=0;
        super.defend(attacker);

    }

}
