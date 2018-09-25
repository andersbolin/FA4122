package com.fortapache.game.engine;

import java.util.ArrayList;

public class Positions {

    //Declare variables
    Player player;
    ArrayList<Enemy> enemies;

    //
    public Positions() {
        player = new Player();
        enemies = new ArrayList<>();
    }

    //Update positions of all actors on screen

    //Create enemy at random side of the fort
    public void createEnemy() {
        Enemy enemy = new Enemy(randomSide());
        //Add enemy to the list of enemies active on the screen
        enemies.add(enemy);
    }
    //Returns random number 1 or 2 with 1/2 chance
    public int randomSide() {
        return (Math.random() <= 0.5) ? 1 : 2;
    }
}
