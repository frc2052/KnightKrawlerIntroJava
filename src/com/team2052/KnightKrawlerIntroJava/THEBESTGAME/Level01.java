package com.team2052.KnightKrawlerIntroJava.THEBESTGAME;

import java.util.ArrayList;
import java.util.Scanner;


public class Level01 {

    private boolean playAgain = true;
    private boolean shield = false;
    private boolean armor = false;
    private boolean sword = false;
    private boolean foundMonk = false;
    private boolean slayedDragon = false;
    private static Level01 instance = null;
    private Inventory inventory;


    private Scanner scanner = null; //object to get user input from command line
    private String move = null; //reuse the variable to collect user input
    private TheRooms theRooms = null;

    private int currentPos = 0;

    public Level01(Inventory m_inventory) {
        inventory = m_inventory;
        scanner = new Scanner(System.in);
        theRooms = TheRooms.getInstance();
    }

    public void play() {
        playAgain = true;
        while (playAgain) {
            reset();
            while (currentPos >= 0) {
                switch (currentPos) {
                    case 0:
                        System.out.println("You were just locked in a dungeon!!! The only way out is to get past an evil wizard who needs you to slay a Dragon for him.");
                        System.out.println("When you open your eyes you see a faint glimmer of something on the ground");
                        System.out.println("You walk toward it and see that it is a small golden key shaped like a dragon");
                        System.out.println("You put it in your pocket, not knowing when it will be used");
                        System.out.println("*You found a key!*");
                        System.out.println("Type \"inventory\" at any time to see your inventory");
                        inventory.addItem("Dragon Key", Inventory.ItemTypeEnum.KEY, 1000, 100, 1, 2, 0);
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
                        } else if (move.toLowerCase().trim().equals("inventory")) {
                            inventory.listInventory();
                        } else {
                            System.out.println("invalid option");
                        }
                        break;
                    case 2: //Spike Death
                        System.out.println("You enter the sheep room... before you get a chance to look around the door closes behind you! You turn around to and try to escape. But you are interrupted by a loud screeching noise and you look over your shoulder to find that large spikes are coming out of the walls at you. You start banging and pushing the door hard but it wont give. You scream for help as the spikes close in but it does nothing and the steel pierces your skin. **You Died** **Game Over** ");
                        currentPos = -1;
                        break;
                    case 3 :
                        if (!armor) {
                            System.out.println("You enter the wolf room and look around. You notice that there is a skeleton in the corner just chillin. So you walk over to him and see that he has really nice armor. **You Found Some Rusty Armor**");
                            inventory.addItem("Rusty Armor", Inventory.ItemTypeEnum.ARMOR, 100, 100, 0, 0, 10);
                            armor = true;
                        } else{
                            System.out.println("This is the room that you found the armor, their is nothing here.");
                        }
                        currentPos = 5;
                        break;
                    case 4: //Shield Room
                        if (!shield){
                            System.out.println("You enter the room. In the dim lighting you see a shimmer in the back of the room. As you approach it you see that it is a rusty old shield. You pick it up. **You picked up a Shield**");
                            inventory.addItem("Rusty Shield", Inventory.ItemTypeEnum.SHIELD, 100, 100, 5, 0, 7);
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
                        } else if (move.toLowerCase().trim().equals("inventory")) {
                            inventory.listInventory();
                        } else {
                            System.out.println("invalid option");
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
                        } else if (move.toLowerCase().trim().equals("inventory")) {
                            inventory.listInventory();
                        } else {
                            System.out.println("invalid option");
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
                        } else if (move.toLowerCase().trim().equals("inventory")) {
                            inventory.listInventory();
                        } else {
                            System.out.println("invalid option");
                        }
                        break;
                    case 7:
                        System.out.println("You open the door and walk down a small skinny hallway. You get to the end and are attacked by three rabid dogs");
                        if (shield || armor) {
                            System.out.println("you are swarmed by the three dogs, but you are able to defend yourself and retreat back down the hallway.");
                            currentPos = 6;
                        } else if (sword){
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
                        } else if (move.toLowerCase().trim().equals("inventory")) {
                            inventory.listInventory();
                        } else {
                            System.out.println("invalid option");
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
                        } else if (move.toLowerCase().trim().equals("inventory")) {
                            inventory.listInventory();
                        } else {
                            System.out.println("invalid option");
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
                        } else if (move.toLowerCase().trim().equals("inventory")) {
                            inventory.listInventory();
                        } else {
                            System.out.println("invalid option");
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
                        } else if (move.toLowerCase().trim().equals("inventory")) {
                            inventory.listInventory();
                        } else {
                            System.out.println("invalid option");
                        }
                        break;
                    case 12:
                        System.out.println("You walk into an empty room. You find a old sword. It's not much, but it'll do.");
                        System.out.println("*You have found a sword* ");
                        inventory.addItem("Rusty Sword", Inventory.ItemTypeEnum.WEAPON, 100, 100, 10, 15, 0);
                        sword = true;
                        currentPos = 11;
                        break;
                    case 13:
                        if (!foundMonk && !slayedDragon) {
                            System.out.println("You open the door and see a old man sitting on a chair. He opens his eyes and looks at you. \"I've been waiting for you.\" he says. I've been trapped down here for a while now. The way out will only open if you kill a monstrous dragon. I'm too old to kill him. Your must slay the dragon and release both of us from this eternal dungeon! Go now, but make sure you are prepared. The dragon will not easily be beaten.");
                            System.out.println("You silently nod in agreement");
                            System.out.println("You turn around and exit the room");
                            foundMonk = true;
                            currentPos = 11;
                        } else if (slayedDragon && !foundMonk){
                            System.out.println("you walk into a room, it looks like someone has been living here for a while. You see a open door in the back of the room");
                            System.out.println("You walk through the door. Down a long hallway, you start to run in hopes of getting free. You see a light. It's getting closer! You finally get to the source of the light. It's just a bared window on the celing.");
                            System.out.println("*Level one Complete*");
                            System.out.println("Made by Ciocci Venterea and Chris Hardwick");
                            currentPos = -1;
                        } else if (slayedDragon && foundMonk){
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
                                    System.out.println("After a long and hard fight, you are victorious!");
                                    slayedDragon = true;
                                    System.out.println("You have slayed the dragon!");
                                    currentPos = 10;
                                } else {
                                    System.out.println("\"You came ill prepared, prepare to die\" The dragon pounces on you. You have died!\"");
                                    currentPos = -1;
                                }
                            }
                        } else {
                            System.out.println("this is room that you slayed the dragon, their is nothing here");
                            currentPos = 10;
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


