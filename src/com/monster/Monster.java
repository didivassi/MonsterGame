package com.monster;

public abstract class  Monster {

    private MonsterType type;
    private int health;

    public Monster(MonsterType type){
        this.type=type;
        health=100;
    }

    public void attack(){

    }

    public void defend(Monster attacker){
        decreaseHealth(attacker.type.damageCaused);
    }

    public void increaseHealth(int amount){
        health += amount;
    }

    public void decreaseHealth(int amount){
        health -= amount;
    }

    public int getHealth(){
        return health;
    }

    @Override
    public String toString(){
        return type.toString();
    }
}
