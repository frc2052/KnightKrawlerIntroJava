package com.team2052.KnightKrawlerIntroJava.THEBESTGAME;

import java.util.Scanner;

public class TheGame {

    private boolean playAgain = true;
    private static TheGame instance = null;

    public static TheGame getInstance() {
        instance = new TheGame();
        return instance;
    }

    private Scanner scanner = null; //object to get user input from command line
    private String move = null; //reuse the variable to collect user input
    private TheRooms theRooms = null;

    private int currentPos = 0;

    public TheGame() {
        scanner = new Scanner(System.in);
        theRooms = TheRooms.getInstance();
    }

    public void play() {
        while (playAgain) {
            while (currentPos >= 0) {
                switch (currentPos) {
                    case 0:
                        System.out.println("You were just locked a dungeon!!! The only way out is to get past an evil wizard who needs you to slay the Dragon for him. Your only choice now is to go forward");
                        currentPos = 1;
                    case 1:
                        System.out.println("You are standing at a four way intersection, and there is a door in front of you with a painting of a skinny little dude sitting in front of a computer working on something called The Game. You can enter that room \"E\" or go right \"R\" or go left \"L\" " );

                }
            }
        }

    }
}
