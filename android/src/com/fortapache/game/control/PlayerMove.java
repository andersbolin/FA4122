package com.fortapache.game.control;

public class PlayerMove {

    /*
    Class for keeping move input on, Stores just one input. Left,Left-Up,Left-Down,Right,Right-Up,Right-Down
    if player is on far end the sprite hits with club instead of move.
     */

    public boolean isLeft() {
        return left;
    }

    public boolean isLeftup() {
        return leftup;
    }

    public boolean isLeftdown() {
        return leftdown;
    }

    public boolean isRight() {
        return right;
    }

    public boolean isRightup() {
        return rightup;
    }

    public boolean isRightdown() {
        return rightdown;
    }

    //Declare variabes
    public boolean left;
    public boolean leftup;
    public boolean leftdown;
    public boolean right;
    public boolean rightup;
    public boolean rightdown;


    //Constructor
    public PlayerMove(boolean left, boolean leftup, boolean leftdown, boolean right, boolean rightup, boolean rightdown) {
        this.left = left;
        this.leftup = leftup;
        this.leftdown = leftdown;
        this.right = right;
        this.rightup = rightup;
        this.rightdown = rightdown;
    }
}
