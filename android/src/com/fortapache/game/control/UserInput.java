package com.fortapache.game.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class UserInput {

    /*User gives input and this class stores it in array and execute move as one by one
    * this way the game can store many moves in array and use game AI in what move
    * is to be executed next. User has little help from this system.
     */

    //Variable declarations
    private Stack<PlayerMove> movelist;
    private ArrayList<PlayerPositions> pp;
    private int currentIndex;

    //Constructor
    public UserInput(){
        currentIndex = 3;
        pp = new ArrayList();
        movelist = new Stack<>();
        pp.add(new PlayerPositions(false,false,false,true));
        pp.add(new PlayerPositions(false,true,true,true));
        pp.add(new PlayerPositions(false,false,true,false));
        pp.add(new PlayerPositions(true,false,true,true));
        pp.add(new PlayerPositions(false,false,true,true));
        pp.add(new PlayerPositions(false,false,false,true));
        pp.add(new PlayerPositions(false,false,true,true));
        pp.add(new PlayerPositions(false,false,true,false));
    }

    //Todo: Add input functions and array to store input in

    //Creates user input and stacks on the FIFO list (movelist)
    public void addUserInput(boolean left,boolean leftup,boolean leftdown,boolean right,boolean rightup,boolean rightdown) {
        PlayerMove pm = new PlayerMove(left,leftup,leftdown,right,rightup,rightdown);
        movelist.add(pm);
    }

    //Takes input from left up of the screen and stores is as a move
    public void inputLeftUp() {
        addUserInput(true,true,false,false,false,false);
    }

    //Takes input from left down of the screen and stores is as a move
    public void inputLeftDown() {
        addUserInput(true,false,true,false,false,false);
    }

    //Takes input from right up of the screen and stores is as a move
    public void inputRightUp() {
        addUserInput(false,false,false,true,true,false);
    }

    //Takes input from right down of the screen and stores is as a move
    public void inputRightDown() {
        addUserInput(false,false,false,true,false,true);
    }

    //Todo: Function that read the movelist and returns what move to do, This will need some AI
    public boolean makeMove() {
        PlayerPositions p = pp.get(currentIndex);
        PlayerMove pm = movelist.pop();

        //TODO: Pop the move list and compare with position, if move is possible then update player
        // else ignore attempted move

        //Compare if move can be done and return
        if(p.isDown() == pm.rightdown){
            //TODO: Go down to position index 6 which is the middle bottom position, reset index to 6
            currentIndex = 5;
            //Todo: update the player position to the new position
        }
        //Todo; Create all move checks

        return false;
    }

}
