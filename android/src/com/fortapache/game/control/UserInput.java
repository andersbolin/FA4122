package com.fortapache.game.control;

import java.util.ArrayList;
import java.util.List;

public class UserInput {

    /*User gives input and this class stores it in array and execute move as one by one
    * this way the game can store many moves in array and use game AI in what move
    * is to be executed next. User has little help from this system.
     */

    //Variable declarations
    private ArrayList<PlayerMove> movelist;
    private List<PlayerPositions>[] pp;

    //Constructor
    public UserInput(){
        pp = new List[8];
        movelist = new ArrayList<PlayerMove>();
        pp[0].add(new PlayerPositions(false,false,false,true));
        pp[1].add(new PlayerPositions(false,true,true,true));
        pp[2].add(new PlayerPositions(false,false,true,false));
        pp[3].add(new PlayerPositions(true,false,true,true));
        pp[4].add(new PlayerPositions(false,false,true,true));
        pp[5].add(new PlayerPositions(false,false,false,true));
        pp[6].add(new PlayerPositions(false,false,true,true));
        pp[7].add(new PlayerPositions(false,false,true,false));
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

}
