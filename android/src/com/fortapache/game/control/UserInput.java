package com.fortapache.game.control;

import java.util.ArrayList;

public class UserInput {

    /*User gives input and this class stores it in array and execute move as one by one
    * this way the game can store many moves in array and use game AI in what move
    * is to be executed next. User has little help from this system.
     */

    //Variable declarations
    private ArrayList<UserInput> movelist;


    //Constructor
    public void UserInput(){
        movelist = new ArrayList<UserInput>();
    }

    //Todo: Add input functions and array to store input in
}
