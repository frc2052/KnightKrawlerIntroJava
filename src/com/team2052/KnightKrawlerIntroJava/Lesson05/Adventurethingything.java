package com.team2052.KnightKrawlerIntroJava.Lesson05;

    import java.util.Scanner;


    public class Adventurethingything{
        private int currentPos = 0; //keeps track of the current location, set to the beginning of the maze, position 0
        private Scanner scanner = null; //object to get user input from command line
        private String move = null; //reuse the variable to collect user input

        public Adventurethingything() {
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
                            System.out.println("You get on you hands and knees and start crawling");
                            System.out.println("You reach the end of crawl space and you are able to stand again");
                            System.out.println("You stand and start to look around");
                            System.out.println("As you look around you see a hallway to your North and to the west");
                            System.out.println("You think you see a source of light at the end of the hallway to your west");


                        }

                }
            }
        }
    }

