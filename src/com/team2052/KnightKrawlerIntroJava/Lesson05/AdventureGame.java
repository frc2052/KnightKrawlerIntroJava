package com.team2052.KnightKrawlerIntroJava.Lesson05;

import java.util.Scanner;

public class AdventureGame {
    private boolean key = false;
        private int currentPos = 0; //keeps track of the current location, set to the beginning of the maze, position 0
        private Scanner scanner = null; //object to get user input from command line
        private String move = null; //reuse the variable to collect user input

        public AdventureGame() {
            scanner = new Scanner(System.in);


        }

        public void play()
        {
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
                        if (key = true){
                            System.out.println("the room has nothing except a delicious chinken sandwich");
                            currentPos = 1;
                        }
                        else {
                            System.out.println("you found a steel door,  Do you enter \"E\" or Go Back \"B\"");
                            move = scanner.nextLine();
                            if (move.toLowerCase().trim().equals("E")) ;
                            System.out.println("luckly you knew how to lockpick easy doors.");
                            System.out.println("you find a room full of stuff, but only choose to pick up a key");
                            currentPos = 1;
                        }
                        if (move.toLowerCase().trim().equals("b")) {
                            currentPos = 1;
                        }
                        break;
                    case 4:
                        System.out.println("you are now in an L shape corridor, do you wish to go \"N\" \"E\"");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("E")) ;
                        currentPos = 1;
                        if (move.toLowerCase().trim().equals("N")) ;
                        currentPos = 5;
                        break;
                    case 5:
                        System.out.println("you are in another corridor, \"N\", \"E\", \"W\",");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("N")) ;
                        currentPos = 6;
                        if (move.toLowerCase().trim().equals("S")) ;
                        currentPos = 4;
                        if (move.toLowerCase().trim().equals("W")) ;
                        currentPos = 7;
                        break;
                    case 6:
                        System.out.println("you run into an strange door.  Do you enter \"E\" or Go Back \"B\"");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("E"));
                        System.out.println("you escaped the dungeon and can now eat your sandwich in peace.");
                        currentPos = -2;
                        if (move.toLowerCase().trim().equals("B"));
                        currentPos = 5;
                        break;
                    case 7:
                        System.out.println("you encounter a very friendly looking room. Do you enter \"E\" or Go Back \"B\"");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("E"));
                        System.out.println("you enter the room and were trapped, and was drop into a pit of spiders. *dark souls meme death screen*");
                        currentPos = -1;
                        if (move.toLowerCase().trim().equals("B"));
                        currentPos = 5;
                        break;
                }

                }
            }
        }


