package com.monster;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Game monsters = new Game(new Player("Count"), new Player("Drakula"));
    monsters.play(Util.getRandom(3,10));

    }
}
