package com.team2052.KnightKrawlerIntroJava.THEBESTGAME;

import java.util.Scanner;

public class TheGame {

    private boolean playAgain = true;
    private boolean shield = false;
    private boolean armor = false;
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
                        System.out.println("You are standing at a four way intersection, and there is a door in front of you with a painting of a skinny little dude sitting in front of a computer working on something called The Game. You can enter the room to the north \"N\" or go east \"E\" or go west \"W\". Which do you choose?" );
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("n")) {
                            currentPos = 4; //Shield Room
                        } else if (move.toLowerCase().trim().equals("e")) {
                            currentPos = 6; //intersection 6
                        } else if (move.toLowerCase().trim().equals("w")) {
                            currentPos = 5; //Two door intersection thingy
                        }
                        break;
                    case 2: //Spike Death
                        System.out.println("You enter the sheep room... before you get a chance to look around the door closes behind you! You turn around to and try to escape. But you are interrupted by a loud screeching noise and you look over your shoulder to find that large spikes are coming out of the walls at you. You start banging and pushing the door hard but it wont give. You scream for help as the spikes close in but it does nothing and the steel pierces your skin. **You Died** **Game Over** ");
                        currentPos = -1;
                        break;
                    case 3 :
                        System.out.println("You enter the wolf room and look around. You notice that there is a skeleton in the corner just chillin. So you walk over to him and see that he has really nice armor. **You Pick up Armor**");
                        armor = true;
                        currentPos = 5;
                    case 4: //Shield Room
                        if (shield == false){
                            System.out.println("You enter the room. In the dim lighting you see a shimmer in the back of the room. As you approach it you see that it is a rusty old shield. You pick it up. **You picked up a Shield**");
                            shield = true;
                            System.out.println("You are standing in the room and you see an exit to the north, \"N\", one to the south, \"S\", and one to the east, \"E\", Which do you choose?");
                        }
                        System.out.println("You are standing in a dimly lit room and you see that it was the same place that you found the shield. You also see the same three exits, you see an exit to the north, \"N\", one to the south, \"S\", and one to the east, \"E\", Which do you choose?");
                        break;
                    case 5:
                        System.out.println("You are standing in front of two doors. One has a picture of a wolf and the other has a picture of a sheep. You can enter the sheep room, \"S\", the wolf room, \"W\", or down the hallway to the east, \"E\" Which do you choose?");
                        if (move.toLowerCase().trim().equals("e")) {
                            currentPos = 1;
                        } else if (move.toLowerCase().trim().equals("s")) {
                            currentPos = 2;
                        } else if (move.toLowerCase().trim().equals("w")) {
                            currentPos = 3;
                        }
                    case 6:
                        System.out.println("You arrive at an intersection with a bunny statue in the middle of it. There is a hallway to the north, \"N\", and a door to the south, \"S\", with a large metal knocker on it. Which do you choose.");
                        if (move.toLowerCase().trim().equals("s")) {
                            currentPos = 7; //three doggies
                        } else (move.toLowerCase().trim().equals("n")) {
                            currentPos = 8;
                        }
                        break;
                    case 7:
                        System.out.println("You open the door and walk down a small skinny hallway. You get to the end and are attacked by three rabid dogs");
                        if (shield == true || armor == true) {
                            System.out.println("");
                        }

                }
            }
        }

    }
}
