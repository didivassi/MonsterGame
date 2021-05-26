package com.monster;

public abstract class  Monster {

    private MonsterType type;
    private int health;

    public Monster(MonsterType type){
        this.type=type;
        health=100;
    }

    public int attack(){
        return type.attackPower;
    }

    public void defend(int attackPower){//podia ser com um int
        decreaseHealth(attackPower);
    }

    public void increaseHealth(int amount){
        health += amount;
    }

    public void decreaseHealth(int amount){
        health -= amount;
       // health=health<0?0:health;

    }

    public int getAttackPower(){
        return type.attackPower;
    }

    public int getHealth(){
        return health;
    }

    @Override
    public String toString(){
        return type.toString();
    }
}
