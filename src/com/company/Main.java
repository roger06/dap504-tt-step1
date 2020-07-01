package com.company;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        // write your code here

        int numberOfPlayers = 8;

        // create and array of 4 player objects
        Player playerArray[] = new Player[numberOfPlayers];


//        create array of Player objects
        for (int i = 0; i < numberOfPlayers; i++) {

            int x = i + 1;
            String firstName = "Player" + x;
            String lastName = "Surname" + x;

            playerArray[i] = new Player(firstName, lastName, 0);

        }

//        display details of all player objects in array.
        for (Player thePlayer : playerArray) {

            Random rAge = new Random();

            thePlayer.age = rAge.nextInt(80);

            System.out.println(thePlayer.firstName + " " + thePlayer.lastName + " " + thePlayer.age);


        } // end foreach




    }
}
