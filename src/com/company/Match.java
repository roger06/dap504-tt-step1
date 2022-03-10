package com.company;

public class Match {

    Player matchPlayer1;
    Player matchPlayer2;



    public Match(Player matchPlayer1, Player matchPlayer2) {
        this.matchPlayer1 = matchPlayer1;
        this.matchPlayer2 = matchPlayer2;
    }


    public Player setWinner(){

        return  matchPlayer1;  // hard coded
    }
}
