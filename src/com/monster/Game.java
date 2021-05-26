package com.monster;

public class Game {

    private final Player player1;
    private final Player player2;
    public Game(Player player1, Player player2){
        this.player1=player1;
        this.player2=player2;
    }

    public void play(int numberOfMonsters){

        player1.chooseMonstersToPlay(numberOfMonsters);
        player2.chooseMonstersToPlay(numberOfMonsters);

        System.out.println(player1 + " will play with " + player2 + " with " + numberOfMonsters + " monsters");
        while (true){
            Player playerAttacker=player1;
            Player playerDefender=player2;
            int changeAttacker=Util.getRandom(0,1);
            if(changeAttacker==1){
                playerAttacker=player2;
                playerDefender=player1;
            }


            if(!playerDefender.canPlayNextRound()){
                System.out.println(playerAttacker + " won the game");
                break;
            }
            if(!playerAttacker.canPlayNextRound()){
                System.out.println(playerDefender + " won the game");
                break;
            }

            Monster monsterAttacker= playerAttacker.attack();
            Monster monsterDefender = playerDefender.defend(monsterAttacker);
            System.out.println(playerAttacker + " is Attacker and chose " + monsterAttacker + " with attack power of " + monsterAttacker.getAttackPower());
            System.out.println(playerDefender+" is Defender chose " + monsterDefender + " and life left is now " + monsterDefender.getHealth());
            System.out.println(playerAttacker + " monsters left " + playerAttacker.monstersLeft());
            System.out.println(playerDefender+" monsters left  " + playerDefender.monstersLeft());

        }


    }

}
