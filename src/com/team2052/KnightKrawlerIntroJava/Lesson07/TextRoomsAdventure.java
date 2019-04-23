package com.team2052.KnightKrawlerIntroJava.Lesson07;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TextRoomsAdventure {
    private boolean playAgain = true;
    private int currentPos = 0; //keeps track of the current location, set to the beginning of the maze, position 0
    private Scanner scanner = null; //object to get user input from command line
    private String move = null; //reuse the variable to collect user input
    private boolean key = false;
    private int roomNumber = 0;
    private int caseBeforeRoom = 1;

    public TextRoomsAdventure() {
        scanner = new Scanner(System.in);
    }

    public void play() {
        Room room = new Room();
        Room[] theRooms = room.newRooms();
        while (playAgain) {
            Collections.shuffle(Arrays.asList(theRooms));
            key = false;
            room.setIsDoorLocked(true);
            System.out.println("Welcome to the dungeon! Someone has barred the door behind you. The only way out is find another exit.");
            currentPos = 0;

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
                        caseBeforeRoom = 1;
                        System.out.println("You are standing at a hallway intersection that moves in all four directions; north, south, east and west.");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("e")) {
                            currentPos = 2;
                            roomNumber = 0;
                        } else if (move.toLowerCase().trim().equals("n")) {
                            currentPos = 2;
                            roomNumber = 1;
                        } else if (move.toLowerCase().trim().equals("w")) {
                            currentPos = 4;
                        } else if (move.toLowerCase().trim().equals("s")) {
                            currentPos = 0;
                        } else {
                            System.out.println("Invalid direction. Only \"N\", \"S\", \"E\", \"W\",  are valid");
                        }
                        break;
                    case 2:
                        if (theRooms[roomNumber].getIsMonsterInside()) {
                            System.out.println(theRooms[roomNumber].getMonsterStory());
                            currentPos = -1;
                        } else if (theRooms[roomNumber].getIsExit()) {
                            if (room.getIsDoorLocked()) {
                                System.out.println(theRooms[roomNumber].getDoorDescription());
                                currentPos = caseBeforeRoom;

                            } else {
                                System.out.println(theRooms[roomNumber].getYouWinStory());
                                currentPos = -1;
                            }
                        } else if (theRooms[roomNumber].getIsKeyInside()) {
                            if (!key) {
                                System.out.println(theRooms[roomNumber].getKeyStory());
                                room.setIsDoorLocked(false);
                                currentPos = caseBeforeRoom;
                            } else {
                                System.out.println("you have already been here, the room is empty");
                                currentPos = caseBeforeRoom;
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
                        caseBeforeRoom = 5;
                        System.out.println("You enter an intersecting hallway");
                        System.out.println("Do you go north, go east, or go south?");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("n")) {
                            roomNumber = 3;
                            currentPos = 2;
                        } else if (move.toLowerCase().trim().equals("e")) {
                            roomNumber = 2;
                            currentPos = 2;
                        } else if (move.toLowerCase().trim().equals("s")) {
                            currentPos = 4;
                        } else {
                            System.out.println("Invalid direction. Only \"N\", \"E\", or \"S\" is valid");
                        }
                        break;
                }
            }
            System.out.println("Do you want to play again?");
            System.out.println("Enter \"Y\" or \"N\"");
            move = scanner.nextLine();
            if (move.toLowerCase().trim().equals("n")) {
                playAgain = false;
            }
        }
    }
}