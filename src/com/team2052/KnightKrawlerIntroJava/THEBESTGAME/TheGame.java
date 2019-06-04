package com.team2052.KnightKrawlerIntroJava.THEBESTGAME;

import java.util.Scanner;

public class TheGame {

    private boolean playAgain = true;
    private boolean shield = false;
    private boolean armor = false;
    private boolean sword = false;
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
            reset();
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
                        break;
                    case 4: //Shield Room
                        if (shield == false){
                            System.out.println("You enter the room. In the dim lighting you see a shimmer in the back of the room. As you approach it you see that it is a rusty old shield. You pick it up. **You picked up a Shield**");
                            shield = true;
                            System.out.println("You are standing in the room and you see an exit to the north, \"N\", one to the south, \"S\", and one to the east, \"E\", Which do you choose?");
                        } else {
                            System.out.println("You are standing in a dimly lit room and you see that it was the same place that you found the shield. You also see the same three exits, you see an exit to the north, \"N\", one to the south, \"S\", and one to the east, \"E\", Which do you choose?");
                        }
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("n")) {
                            currentPos = 10;
                        } else if (move.toLowerCase().trim().equals("s")){
                            currentPos = 1;
                        }else if (move.toLowerCase().trim().equals("e")) {
                            currentPos = 8;
                        }
                        break;
                    case 5:
                        System.out.println("You are standing in front of two doors. One has a picture of a wolf and the other has a picture of a sheep. You can enter the sheep room, \"S\", the wolf room, \"W\", or down the hallway to the east, \"E\" Which do you choose?");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("e")) {
                            currentPos = 1;
                        } else if (move.toLowerCase().trim().equals("s")) {
                            currentPos = 2;
                        } else if (move.toLowerCase().trim().equals("w")) {
                            currentPos = 3;
                        }
                        break;
                    case 6:
                        System.out.println("You arrive at an intersection with a bunny statue in the middle of it. There is a hallway to the north, \"N\", a hallway to the west, \"W\", and a door to the south, \"S\", with a large metal knocker on it. Which do you choose?");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("s")) {
                            currentPos = 7; //thee doggies
                        } else if (move.toLowerCase().trim().equals("n")) {
                            currentPos = 8;
                        } else if (move.toLowerCase().trim().equals("w")) {
                            currentPos = 1;
                        }
                        break;
                    case 7:
                        System.out.println("You open the door and walk down a small skinny hallway. You get to the end and are attacked by three rabid dogs");
                        if (shield == true || armor == true) {
                            System.out.println("you are swarmed by the three dogs, but you are able to defend yourself and retreat back down the hallway.");
                            currentPos = 6;
                        } else if (sword == true){
                            System.out.println("you are swarmed by the dogs, you swing your sword and you manage to  kill one but the other two devour you. You have died.");
                        } else {
                            System.out.println("you are swarmed by the dogs and they devour you. You have died.");
                        }
                        break;
                    case 8:
                        System.out.println("you find a bend in the hallway. You see what looks like it used to be a hallway but it's caved in. You can go North \"N\", South \"S\", or West\"W\". Which do you choose?");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("n")){
                            currentPos = 9;
                        } else if (move.toLowerCase().trim().equals("s")) {
                            currentPos = 6;
                        } else if (move.toLowerCase().trim().equals("w")) {
                            currentPos = 4;
                        }
                        break;
                    case 9:
                        System.out.println("you enter another bend in the hallway. their is a mysterious chest lying in the center. it is locked. You can go East \"E\", West \"W\" or South \"S\". Which do you choose?");
                        move = scanner.nextLine();
                        if (sword && move.toLowerCase().trim().equals("open chest")){
                            System.out.println("You break the lock with your sword and open the chest. It contains a note that says \"The Game, created by Ciocci and Chris\". The note seems ueseless, but you keep it anyway. You can go west, east, or south");
                            move = scanner.nextLine();
                        }

                        if (move.toLowerCase().trim().equals("w")){
                            currentPos = 10;
                        }  else if (move.toLowerCase().trim().equals("s")) {
                            currentPos = 8;
                        }  else if (move.toLowerCase().trim().equals("e")) {
                            currentPos = 11;
                        }
                        break;
                    case 10:
                        System.out.println("you see a door with a sign that says \"Danger! Enter with caution\" do go in the room\"I\", go down the hallway to the east\"E\", or go down the hallway to the south\"S\". Which do you choose?");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("i")){
                            currentPos = 14;
                        } else if (move.toLowerCase().trim().equals("s")) {
                            currentPos = 4;
                        } else if (move.toLowerCase().trim().equals("e")) {
                            currentPos = 9;
                        }
                        break;
                    case 11:
                        System.out.println("you see a door to the north with a painting of a young man. Do you go in the room \"I\", go down the hallway to the south \"S\", or go down the hallway to the west \"W\"");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("i")){
                            currentPos = 13;
                        } else if (move.toLowerCase().trim().equals("s")) {
                            currentPos = 12;
                        }else if (move.toLowerCase().trim().equals("w")) {
                            currentPos = 9;
                        }
                        break;
                }
            }
            System.out.println("do you want to play again?");
            System.out.println("\"Y\" or \"N\"");
            move = scanner.nextLine();
            if (move.toLowerCase().trim().equals("y")){
                currentPos = 1;
            } else if (move.toLowerCase().trim().equals("n")){
                playAgain = false;
            }
        }

    }
    private void reset(){
        sword = false;
        shield = false;
        armor = false;

    }
}


