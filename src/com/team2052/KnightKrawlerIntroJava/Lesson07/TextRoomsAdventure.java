package com.team2052.KnightKrawlerIntroJava.Lesson07;

import java.util.Scanner;

import com.team2052.KnightKrawlerIntroJava.Lesson07.Room;

public class TextRoomsAdventure {
    private boolean playAgain = true;
    private int currentPos = 0; //keeps track of the current location, set to the beginning of the maze, position 0
    private Scanner scanner = null; //object to get user input from command line
    private String move = null; //reuse the variable to collect user input
    private boolean key = false;
    public TextRoomsAdventure() {
        scanner = new Scanner(System.in);
    }

    public void play() {
        Room room = new Room();
        Room[] theRooms = room.newRooms();
        while (playAgain) {
            System.out.println("Welcome to the dungeon! Someone has barred the door behind you. The only way out is find another exit.");
            while (currentPos >= 0) {
                switch (currentPos) {
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
                        if(theRooms[0].getIsMonsterInside()){
                            theRooms[0].getMonsterStory();
                            currentPos = -1;
                        } else if (theRooms[0].getIsExit()){
                            if(room.getIsDoorLocked()){
                                System.out.println(theRooms[0].getDoorDescription());
                                currentPos = 1;

                            } else{
                                System.out.println(theRooms[0].getYouWinStory());
                                currentPos = -1;
                            }
                        } else if (theRooms[0].getIsKeyInside()) {
                            System.out.println(theRooms[0].getKeyStory());
                            room.setIsDoorLocked(false);
                        }
                        /*
                        System.out.println("You have found a large wooden door that is latched from the outside. Do you enter \"T\" or Go Back \"B\"");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("t")) {
                            System.out.println("You unlock the door and slowly push the door open.");
                            System.out.println("As you enter the room a small candle on the table catches your attention.");
                            System.out.println("As you are mesmerized by the flame, you fail to notice the witch who casts a spell to turn you to stone.");
                            System.out.println("You will forever adorn her room. You have died.");
                            currentPos = -1;
                        } else if (move.toLowerCase().trim().equals("b")) {
                            currentPos = 1;
                        } else {
                            System.out.println("Invalid direction. Only \"T\" and \"B\" are valid");
                        }*/
                        break;
                    case 3:
                        if (key) {
                            System.out.println("You made it out of the maze!");
                            System.out.println("You go back to your family and live a happy live vowing to never go on another adventure again");
                            currentPos = -1;
                        } else {
                            System.out.println("You have found a locked door, you need to find a key");
                            System.out.println("Go back \"B\"");
                            move = scanner.nextLine();
                            if (move.toLowerCase().trim().equals("b")) {
                                currentPos = 1;
                            } else {
                                System.out.println("Invalid direction.  Only \"B\" is valid");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("You enter a bend in the hallway");
                        System.out.println("You can go north or go east");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("n")) {
                            currentPos = 5;
                        } else if (move.toLowerCase().trim().equals("e")) {
                            currentPos = 1;
                        } else {
                            System.out.println("Invalid direction. Only \"N\" or \"E\" is valid");
                        }
                        break;
                    case 5:
                        System.out.println("You enter an intersecting hallway");
                        System.out.println("Do you go north, go east, or go south?");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("n")) {
                            currentPos = 6;
                        } else if (move.toLowerCase().trim().equals("e")) {
                            currentPos = 7;
                        } else if (move.toLowerCase().trim().equals("s")) {
                            currentPos = 4;
                        } else {
                            System.out.println("Invalid direction. Only \"N\", \"E\", or \"S\" is valid");
                        }
                        break;
                    case 6:
                        System.out.println("You enter a dark room");
                        System.out.println("All you see is a spotlight shining on a key");
                        System.out.println("Do you take it? \"T\" or go back \"B\" ?");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("t")) {
                            System.out.println("You have found the Key!");
                            System.out.println("Now you have to find the door");
                            System.out.println("You only can go back south");
                            key = true;
                            move = scanner.nextLine();
                            if (move.toLowerCase().trim().equals("s")) {
                                currentPos = 5;
                            } else {
                                System.out.println("Invalid direction. Only \"S\" is valid");
                            }
                        } else if (move.toLowerCase().trim().equals("b")) {
                            currentPos = 5;
                        } else {
                            System.out.println("Invalid option.  Only \"");
                        }
                        break;
                    case 7:
                        System.out.println("As leave the cave you breath a breath of fresh air");
                        System.out.println("Then all of the sudden, the cave collapses behind you, leaving you to watch helplessly as a pack of wolves close in");
                        System.out.println("You have been devoured.  You have died");
                        currentPos = -1;
                        break;
                }
            }
            System.out.println("Do you want to play again?");
            System.out.println("Enter \"Y\" or \"N\"");
            move = scanner.nextLine();
            if (move.toLowerCase().trim().equals("n")) {
                playAgain = false;
            } else {
                currentPos = 0;

            }
        }
    }


}