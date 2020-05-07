package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // tournament of 4 players

        // create a player object to test.

        Player player1 = new Player("John", "Smith");
        Player player2 = new Player("Fred", "Brown");

        System.out.println("Player 1 is: " + player1.firstName + " " + player1.lastName);

        // create and array of 4 player objects
         Player playerArray[] = new Player[2];
         
         playerArray[0] = player1;
         playerArray[1] = player2;


        for (Player thePlayer: playerArray ) {

            System.out.println(thePlayer.firstName + " " + thePlayer.lastName);
        } // end foreach
         


        // echo out all the details.







    }
}
