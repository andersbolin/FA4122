package com.fortapache.game.control;

public class PlayerPositions {

    //Declare variables
    private boolean up;
    private boolean down;
    private boolean left;
    private boolean right;

    public PlayerPositions(boolean up, boolean down, boolean left, boolean right) {
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
    }

    public boolean isUp() {
        return up;
    }

    public boolean isDown() {
        return down;
    }

    public boolean isLeft() {
        return left;
    }

    public boolean isRight() {
        return right;
    }


}
