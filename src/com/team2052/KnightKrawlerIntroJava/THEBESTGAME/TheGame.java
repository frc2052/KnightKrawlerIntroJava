package com.team2052.KnightKrawlerIntroJava.THEBESTGAME;

import java.util.Scanner;

public class TheGame {

    private boolean playAgain = true;
    private boolean shield = false;
    private boolean armor = false;
    private boolean sword = false;
    private boolean foundMonk = false;
    private boolean slayedDragon = false;
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
                        if (!shield){
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
                            System.out.println("You break the lock with your sword and open the chest. It contains a note that says \"The Game is the best game\". The note seems useless, but you keep it anyway. You can go west, east, or south");
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
                        System.out.println("you see a door with a sign that says \"Danger! Enter with caution\" do go in the room \"I\", go down the hallway to the east \"E\", or go down the hallway to the south \"S\". Which do you choose?");
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
                        System.out.println("you see a door to the north with a painting of a young man. Do you go in the room \"I\", go down the hallway to the south \"S\", or go down the hallway to the west \"W\" Which do you choose?");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("i")){
                            currentPos = 13;
                        } else if (move.toLowerCase().trim().equals("s")) {
                            currentPos = 12;
                        }else if (move.toLowerCase().trim().equals("w")) {
                            currentPos = 9;
                        }
                        break;
                    case 12:
                        System.out.println("You have found a sword");
                        sword = true;
                        currentPos = 11;
                        break;
                    case 13:
                        if (!foundMonk) {
                            System.out.println("You open the door and see a old man sitting on a chair. He opens his eyes and looks at you. \"I've been waiting for you.\" he says. I've been trapped down here for a while now. The way out will only open if you kill a monstrous dragon. I'm too old to kill him. Your must slay the dragon and release both of us from this eternal dungeon! Go now, but make sure you are prepared. The dragon will not easily be beaten.");
                            foundMonk = true;
                            currentPos = 11;
                        } else if (slayedDragon){
                            System.out.println("You walk into the room and find that the old man is gone. But you also see a door that wasn't opened the last time you were here.");
                            System.out.println("You walk through the door. Down a long hallway, you start to run in hopes of getting free. You see a light. It's getting closer! You finally get to the source of the light. It's just a bared window on the celing. The old man lied to you!");
                            System.out.println("*Level one Complete*");
                            System.out.println("Made by Ciocci Venterea and Chris Hardwick");
                            currentPos = -1;
                        } else {
                            System.out.println("You walk into the room and find the old man sitting on his chair. \"remember, you must slay the dragon in order to free us.\"");
                            currentPos = 11;
                        }
                        break;
                    case 14:
                        if (!slayedDragon) {
                            System.out.println("As you walk down a hallway, you hear a voice \"Who dares disturb my rest\"");
                            System.out.println("\"Why have you come here?\"");
                            System.out.println("You walk through the hallway and finally come to a big door");
                            System.out.println("Do you go in? \"I\" or turn back \"B\", before its to late");
                            move = scanner.nextLine();
                            if (move.trim().toLowerCase().equals("b")){
                                currentPos = 10;
                            } else if (move.trim().toLowerCase().equals("i")){
                                System.out.println("You open the door and see a massive dragon sitting on a rock.");
                                if (armor && sword && shield) {
                                    slayedDragon = true;
                                    System.out.println("You have slayed the dragon!");
                                    currentPos = 10;
                                } else {
                                    System.out.println("\"You came ill prepared, prepare to die\" The dragon pounces on you. You have died!\"");
                                    currentPos = -1;
                                }
                            }
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
        slayedDragon = false;
        foundMonk = false;

    }
}


