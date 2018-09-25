package com.fortapache.game.engine;

import android.graphics.Point;

public class Fire {

    //Declare variables
    private Point position;


    //Constructor
    public Fire(int x, int y) {
        position.x = x;
        position.y = y;
    }

    public Point getPosition() {
        return position;
    }

    public void updatePosition(int x, int y) {
        position.x = x;
        position.y = y;
    }








}
