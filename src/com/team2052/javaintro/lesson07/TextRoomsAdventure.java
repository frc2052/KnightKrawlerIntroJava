package com.team2052.javaintro.lesson07;
import java.util.Scanner;

public class TextRoomsAdventure {
    private int currentPos = 0; //keeps track of the current location, set to the beginning of the maze, position 0
    private Scanner scanner = null; //object to get user input from command line
    private String move = null; //reuse the variable to collect user input
    private boolean hasKey = false;

    public TextRoomsAdventure() {
        scanner = new Scanner(System.in);
    }

    public void play()
    {
        System.out.println("Welcome to the dungeon! Someone has barred the door behind you. The only way out is find another exit.");
        while (currentPos >= 0) {
            switch (currentPos)
            {
                case 0:
                    System.out.println("You are at the entrance, you can only go north. Type \"N\" to go north.");
                    move = scanner.nextLine();
                    if (move.toLowerCase().trim().equals("n"))
                    {
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
                    System.out.println("You have found a large wooden door that is latched from the outside. Do you enter \"E\" or Go Back \"B\"");
                    move = scanner.nextLine();
                    if (move.toLowerCase().trim().equals("e")) {
                        System.out.println("You unlock the door and slowly push the door open.");
                        System.out.println("As you enter the room a small candle on the table catches your attention.");
                        System.out.println("As you are mesmerized by the flame, you fail to notice the witch who casts a spell to turn you to stone.");
                        System.out.println("You will forever adorn her room. You have died.");
                        currentPos = -1;
                    } else if (move.toLowerCase().trim().equals("b")) {
                        currentPos = 2;
                    } else {
                        System.out.println("Invalid direction. Only \"E\" and \"B\" are valid");
                    }
                    break;
                case 3:
                    System.out.println("You have reached a large metal door. You try the handle and it appears to be locked.");
                    if (!hasKey) {
                        System.out.println("You turn around and go back, there isn't anything you can do right now.");
                        currentPos = 1;
                    } else if (hasKey) {
                        System.out.println("Would you like to try the key you have? \"y\" or \"n\"");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("y")) {
                            System.out.println("You try the key at the lock and it turns and unlocks. You swing the door open and step inside.");
                            System.out.println("You have completed the level. Good Job!");
                            //System.out.println(yourTime);
                            currentPos = -1;
                        }
                    }
                    break;
                case 4:
                    System.out.println("You are standing at a hallway intersection that moves with only 2 directions; north or east.");
                    move = scanner.nextLine();
                    if (move.toLowerCase().trim().equals("n")) {
                        currentPos = 5;
                    } else if (move.toLowerCase().trim().equals("e")) {
                        currentPos = 1;
                    } else {
                        System.out.println("Invalid direction. Only \"N\" or \"E\" are valid");
                    }
                    break;
                case 5:
                    System.out.println("You are standing at a hallway intersection that moves with 3 directions; north, south, or west.");
                    move = scanner.nextLine();
                    if (move.toLowerCase().trim().equals("n")) {
                        currentPos = 6;
                    } else if (move.toLowerCase().trim().equals("w")) {
                        currentPos = 7;
                    } else if (move.toLowerCase().trim().equals("s")) {
                        currentPos = 4;
                    }else {
                        System.out.println("Invalid direction. Only \"N\" or \"E\" are valid");
                    }
                    break;
                case 6:
                    System.out.println("You have reached an empty room. Do you enter \"E\" or Go Back \"B\"");
                    move = scanner.nextLine();
                    if (move.toLowerCase().trim().equals("e")) {
                        System.out.println("There is nothing here. As you leave the room, a monster comes from the ceiling and blocks your exit. Do you fight \"f\" or try to run \"r\" away by tricking it?");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("f") && !hasKey) {
                            System.out.println("You try to fight the monstor with your fists but you have nothing to defend yourself. The monster dooms you and you die.");
                            currentPos = -1;
                        } else if (move.toLowerCase().trim().equals("f") && hasKey) {
                            System.out.println("You pull out your key. You fight the monster, dodge its swipes, and manage to jab the key into its eye.");
                            System.out.println("The monster reels in pain, taking your key with it. You see an opening after it moves slightly out of the way, and slide for the door.");
                            System.out.println("You have escaped. However, you lost your key in the process. Good thing you remember feeling another key at the bottom of the vase...");
                            currentPos = 5;
                        } else if (move.toLowerCase().trim().equals("r") && !hasKey) {
                            System.out.println("You try to juke out the monstor, but you have nothing to distract it. It easily swipes you and dooms you. You have died.");
                            currentPos = -1;
                        } else if (move.toLowerCase().trim().equals("r") && hasKey) {
                            System.out.println("You pull out your key. You juke the monster, and manage to throw the key into its eye.");
                            System.out.println("The monster reels in pain. You see an opening after it moves slightly out of the way, and slide for the door.");
                            System.out.println("You have escaped. However, you lost your key in the process. Good thing you remember feeling another key at the bottom of the vase...");
                            currentPos = 5;
                        }
                        currentPos = 5;
                    } else if (move.toLowerCase().trim().equals("b")) {
                        currentPos = 5;
                    } else {
                        System.out.println("Invalid direction. Only \"E\" and \"B\" are valid");
                    }
                    break;
                case 7:
                    System.out.println("You have come to a completley dark room that seems to suck in all light. Will you continue to enter? Enter \"Y\" to continue");
                    move = scanner.nextLine();
                    if (move.toLowerCase().trim().equals("y")) {
                        System.out.println("You rummage around the room in the dark, and feel what you think is a vase and a stool.");
                        System.out.println("Would you like to reach into the vase? Enter \"Y\" to do so, or \"N\" to leaved the room.");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("y")) {
                            System.out.println("Inside the vase you find a key. You put it into your pocket.");
                            hasKey = true;
                            currentPos = 5;
                        }
                        else {
                            currentPos = 5;
                        }
                    } else {
                        currentPos = 5;
                    }
                    break;
            }
        }
    }
}