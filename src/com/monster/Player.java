package com.monster;

public class Player {

    final private String name;
    private Monster[] monsters;

    public Player(String name){
        this.name=name;
    }

    public void chooseMonstersToPlay(int monstersToAdd){
        monsters=new Monster[monstersToAdd];
        for (int i = 0; i < monsters.length; i++) {
            monsters[i]=MonsterFactory.getRandomMonster();
           // System.out.println("created "  +  monsters[i]);
        }
    }

    public Monster attack(){
        Monster monster=pickMonsterHand();
        monster.attack();
        return monster;
    }

    public Monster defend(Monster attacker){
        Monster monster= pickMonsterHand();
        monster.defend(attacker.attack());
        return monster;
    }

    public boolean canPlayNextRound(){
        return monstersLeft()>0;
    }


    public int monstersLeft(){
        int monstersLeft=monsters.length;
        for (Monster monster:monsters) {
            if(monster.getHealth()<=0){
                monstersLeft--;
            }
        }
        return monstersLeft;
    }

    private Monster pickMonsterHand(){
        Monster monster=monsters[Util.getRandom(0,monsters.length-1)];
        if(monster.getHealth()<=0){
           return pickMonsterHand();
        }
         return monster;

              /*Monster biggestHealthMonster=null;
        int biggestHealth=0;
        for (Monster monster:monsters) {
            if(monster.getHealth()>biggestHealth){
                biggestHealthMonster=monster;
                biggestHealth=monster.getHealth();
            }
        }*/
    }

    @Override
    public String toString(){
        return name;
    }
}
