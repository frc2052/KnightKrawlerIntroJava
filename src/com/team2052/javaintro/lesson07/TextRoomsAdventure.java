package com.team2052.javaintro.lesson07;

import java.util.Scanner;

public class TextRoomsAdventure {
    private int currentPos = 0; //keeps track of the current location, set to the beginning of the maze, position 0
    private Scanner scanner = null; //object to get user input from command line
    private String move = null; //reuse the variable to collect user input
    boolean playerHasKey = false;
    public TextRoomsAdventure() {
        scanner = new Scanner(System.in);
    }

    Room[] rooms = newRoom[7];

    public void play() {
        System.out.println("Welcome to the dungeon! Someone has barred the door behind you. The only way out is find another exit.");
        while (currentPos >= 0) {
            switch (currentPos)
            {
            case 0:
                System.out.println("You are at the entrance, you can only go north. Type \"N\" to go north.");
                move = scanner.nextLine();
                if (move.toLowerCase().trim().equals("n")) { 
                    currentPos = 1;
                } else {
                    System.out.println("Invalid direction. Only \"N\" is valid");
                }
                break;
            case 1:
                System.out.println("You are standing at a hallway intersection that moves in all four directions; north, south, east and west.");
                move = scanner.nextLine();
                if (move.toLowerCase().trim().equals("e")) {
                    currentPos = 2;
                } else if (move.toLowerCase().trim().equals("n")) {
                    currentPos = 3;
                } else if (move.toLowerCase().trim().equals("w")) {
                    currentPos = 4;
                } else if (move.toLowerCase().trim().equals("s")) {
                    currentPos = 0;
                } else {
                    System.out.println("Invalid direction. Only \"N\", \"S\", \"E\", \"W\",  are valid");
                }
                break;
            case 2:
                System.out.println("You see a small room, with a large wooden door that is latched from the outside. Do you Enter \"E\" or Go Back \"B\"?");
                move = scanner.nextLine();
                if (move.toLowerCase().trim().equals("e")) {
                    System.out.println("You unlock the door and slowly push the door open.");
                    System.out.println("As you enter the room a small candle on the table catches your attention.");
                    System.out.println("As you are mesmerized by the flame, you fail to notice the witch who casts a spell to turn you to stone.");
                    System.out.println("You will forever adorn her room. You have died.");
                    currentPos = -1;
                } else if (move.toLowerCase().trim().equals("b")) {
                    System.out.println("You decide to move back.");
                    currentPos = 1;
                } else {
                    System.out.println("Invalid direction. Only \"E\" and \"B\" are valid");
                }
                break;
            case 3: 
                System.out.println("You look forward into a large banquet hall, with the table empty. Do you enter \"E\" or Go Back \"B\"?");
                move = scanner.nextLine();

                if (move.toLowerCase().trim().equals("e") && playerHasKey) {
                    System.out.println("You find a door, but it seems to be locked. Luckily, you obtained a key. You unlock it.");
                    System.out.println("As you unlock the door, you see the sun shine brightly outside. Congratulations, you've escaped!");
                    currentPos = -1;
                } else if (move.toLowerCase().trim().equals("b")) {
                    System.out.println("You decide to move back.");
                    currentPos = 1;
                } else if (move.toLowerCase().trim().equals("e")) {
                    System.out.println("You find a door, but it seems to be locked. You'll need a key to unlock it, but where could it be?");
                    currentPos = 3;
                } else {
                    System.out.println("Invalid direction. Only \"E\" and \"B\" are valid.");
                }
                break;
            case 4: 
                System.out.println("You are standing inside of a hallway with the only way to go being north. Do you go North, \"N\", or back West, \"W\"?");
                move = scanner.nextLine();
                if (move.toLowerCase().trim().equals("n")) {
                    System.out.println("You move forward in the hallway, and end up at an intersection.");
                    currentPos = 5;
                } else if (move.toLowerCase().trim().equals("w")) {
                    System.out.println("You decide to move back west.");
                    currentPos = 1;
                } else {
                    System.out.println("Invalid direction. Only \"N\" or \"W\" are valid.");
                }
                break;
            case 5: 
                System.out.println("You are at an intersection with openings to the north or the west.");
                System.out.println("Do you go North, \"N\", West, \"W\", or South \"S\"?");
                move = scanner.nextLine();
                if (move.toLowerCase().trim().equals("n")) {
                    System.out.println("You move forward into a cellar, with kegs lining the walls.");
                    System.out.println("As you squint into the dark, a blaze appears before you.");
                    System.out.println("The blaze grows brighter and rushes towards you, as a great cackle erupts in the room.");
                    System.out.println("The blaze opens up to reveal the very depths of the Underworld, and it consumes you.");
                    System.out.println("You have died.");
                    currentPos = -1;
                } else if (move.toLowerCase().trim().equals("w")) {
                    System.out.println("You move to the left into a grand kitchen, where you peer toward the adjacent wall.");
                    System.out.println("You see a key attached to a hook, and you run up and grab it. Now what does this key unlock?");
                    System.out.println("You move back to the intersection, curious as to where the key will go.");
                    currentPos = 5;
                    playerHasKey = true;
                } else if (move.toLowerCase().trim().equals("s")) {
                    System.out.println("You move downward toward the hallway.");
                    currentPos = 4;
                } else {
                    System.out.println("Invalid direction. Only \"N\", \"W\", and \"S\" are valid.");
                }
                break;
            }
        }
    }

    public void visitRoom(Room room) {
        System.out.println(room.getDoorDescription());
        move = scanner.nextLine();

        if (move.toLowerCase().trim().equals("e")) {
            if (room.getIsDoorLocked() && playerHasKey) {
                System.out.println("You find a door, but it seems to be locked. Luckily, you obtained a key. You unlock it.");
            } else if (room.getIsKeyInside()) {
                System.out.println("You see a key attached to a hook, and you run up and grab it. Now what does this key unlock?");
                playerHasKey = true;
            } else if (room.getIsDoorLocked()) {
                System.out.println("You find a door, but it seems to be locked. You'll need a key to unlock it, but where could it be?");
            } else {

            }

            if (room.getIsExit()) {
                System.out.println("As you unlock the door, you see the sun shine brightly outside. Congratulations, you've escaped!");
            }

            currentPos = -1;
        } else if (move.toLowerCase().trim().equals("b")) {
            System.out.println("You decide to move back.");
            currentPos = 1;
        } else if (move.toLowerCase().trim().equals("e")) {
            System.out.println("You find a door, but it seems to be locked. You'll need a key to unlock it, but where could it be?");
            currentPos = 3;
        } else {
            System.out.println("Invalid direction. Only \"E\" and \"B\" are valid.");
        }
    }
}
