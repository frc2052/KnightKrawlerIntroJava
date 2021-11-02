package com.team2052.javaintro.lesson05;

import java.util.Scanner;

public class AdventureGame {
    private int currentPos = 0; //keeps track of the current location, set to the beginning of the maze, position 0
    private Scanner scanner = null; //object to get user input from command line
    private String move = null; //reuse the variable to collect user input

    public AdventureGame() {
        scanner = new Scanner(System.in);
    }

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
                System.out.println("You see a small, with a large wooden door that is latched from the outside. Do you Enter \"E\" or Go Back \"B\"?");
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
                if (move.toLowerCase().trim().equals("e")) {
                    System.out.println("You find a door, but it seems to be locked. You'll need a key to unlock it, but where could it be?");
                    currentPos = 3;
                } else if (move.toLowerCase().trim().equals("b")) {
                    System.out.println("You decide to move back.");
                    currentPos = 1;
                } else {
                    System.out.println("Invalid direction. Only \"E\" and \"B\" are valid.");
                }
                break;
            case 4: 
                System.out.println("You move west, and are standing inside of a hallway. You can only go North, \"N\" or Back \"B\". Where do you go?");
                move = scanner.nextLine();
                if (move.toLowerCase().trim().equals("n")) {
                    System.out.println("You move forward in the hallway, and end up at an intersection.");
                    currentPos = 5;
                } else if (move.toLowerCase().trim().equals("b")) {
                    System.out.println("You decide to move back.");
                    currentPos = 1;
                } else {
                    System.out.println("Invalid direction. Only \"N\" or \"B\" are valid.");
                }
                break;
            }
        }
    }
}
