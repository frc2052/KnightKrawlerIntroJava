package com.team2052.KnightKrawlerIntroJava.Lesson07;

import java.util.Scanner;

public class TextRoomAdventures {
        private int currentPos = 0; //keeps track of the current location, set to the beginning of the maze, position 0
        private Scanner scanner = null; //object to get user input from command line
        private String move = null; //reuse the variable to collect user input

        public TextRoomAdventures() {
            scanner = new Scanner(System.in);
        }
        private boolean key = false;
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
                        System.out.println("You can only go one of the four directions type N, S, E, W.");
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
                            currentPos = 1;
                        } else {
                            System.out.println("Invalid direction. Only \"E\" and \"B\" are valid");
                        }
                        break;
                    case 3:
                        System.out.println("You come to a large metal door that is ajar");
                        System.out.println("You can choose to enter the room ahead \"E\", or turn back to the previous intersection \"B\"");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("e")) {
                            System.out.println("You push the massive door open.");
                            System.out.println("You are now thirsty from doing all that work, but luckily you see a pool of water across the room.");
                            System.out.println("The water looks clean enough and you decide to start drinking the water.");
                            System.out.println("While you are drinking the water a golden glimmer coming from the water catches your eye.");
                            System.out.println("You reach for it.");
                            System.out.println("But right before you are able to grab the object, an unseen force grabs you and pulls you into the deep water.");
                            System.out.println("You kick and punch but your efforts are useless");
                            System.out.println("As the last bit of air slips out of your lungs and through your lips, you drown");
                            currentPos = -1;
                        } else if (move.toLowerCase().trim().equals("b")) {
                            currentPos = 1;
                        }
                        break;
                    case 4:
                        System.out.println("You walk down the hallway and as it seems to end you notice a small crawl space to the north");
                        System.out.println("You can enter the dark crawl space \"E\" or choose to go back to the previous intersection \"B\"");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("e")) {
                            currentPos = 5;
                        } else if (move.toLowerCase().trim().equals("b")) {
                            currentPos = 1;
                        }
                        break;
                    case 5:
                        System.out.println("You get on you hands and knees and start crawling");
                        System.out.println("You reach the end of crawl space and you are able to stand again");
                        System.out.println("You stand and start to look around");
                        System.out.println("You see a door to your North and to the west");
                        System.out.println("You think you see a source of light coming for the door to your west and the door to your north looks broken");
                        System.out.println("Do you move to the North (\"n\"), West (\"w\"), or South (\"s\"), and go back through the crawlspace");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("n")) {
                            currentPos = 6;
                        } else if (move.toLowerCase().trim().equals("w")) {
                            currentPos = 7;
                        } else if (move.toLowerCase().trim().equals("s")) {
                            currentPos = 4;
                        }
                        break;
                    case 6:
                        System.out.println("You walk down the hallway in front of you and come to a room with a broken door");
                        System.out.println("You walk inside and it looks like no one has been there in years");
                        System.out.println("A shiny brass object catches your eye and you go to pick it up");
                        System.out.println("**You Picked Up A Key**");
                        System.out.println("You are now standing back at the intersection next to the crawl space");
                        System.out.println("Do you move to the North (\"n\"), West (\"w\"), or South (\"s\"), and go back through the crawlspace");
                        move = scanner.nextLine();
                        key = true;
                        if (move.toLowerCase().trim().equals("n")) {
                            currentPos = 6;
                        } else if (move.toLowerCase().trim().equals("w")) {
                            currentPos = 7;
                        } else if (move.toLowerCase().trim().equals("s")) {
                            currentPos = 4;
                        }
                        break;
                    case 7:
                        if (key == false) {
                            System.out.println("You come to a large metal door");
                            System.out.println("The door is locked and wont seem to move no matter how hard you push");
                            System.out.println("Your only option is to go back to the intersection next to the crawlspace");
                            System.out.println("You are now standing back at the intersection next to the crawl space");
                            System.out.println("Do you move to the North (\"n\"), West (\"w\"), or South (\"s\"), and go back through the crawlspace");
                            move = scanner.nextLine();
                            if (move.toLowerCase().trim().equals("n")) {
                                currentPos = 6;
                            } else if (move.toLowerCase().trim().equals("w")) {
                                currentPos = 7;
                            } else if (move.toLowerCase().trim().equals("s")) {
                                currentPos = 4;
                            }
                        } else if (key == true) {
                            System.out.println("You approach the large metal door");
                            System.out.println("This time you notice a small key hole");
                            System.out.println("You reach into your pocket to grab the key you found");
                            System.out.println("You slide it into the key whole and twist it");
                            System.out.println("You hear two loud metalic sounds and the door slowly starts to open");
                            System.out.println("You are greeted by a blinding light but as your eyes adjust you can see that you made it to the surface");
                            System.out.println("**Level 1 Passed**");
                            currentPos = -1;
                        }
                        break;
                }

            }
        }
    }



