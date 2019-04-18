package com.team2052.KnightKrawlerIntroJava.Lesson07;

import com.team2052.KnightKrawlerIntroJava.Lesson06.Card;
import com.team2052.KnightKrawlerIntroJava.Lesson07.Room;

import java.util.Random;
import java.util.Scanner;


public class TextRoomsAdventure{
    private int currentPos = 0; //keeps track of the current location, set to the beginning of the maze, position 0
    private Scanner scanner = null; //object to get user input from command line
    private String move = null; //reuse the variable to collect user input

    public TextRoomsAdventure() {
        scanner = new Scanner(System.in);
    }
    private boolean key = false;

    private Room monster1;
    private Room monster2;
    private Room brasskey;
    private Room exit;
    private Room escape;

    public static Room[] RandomizeArray(Room[] array){
        Random rgen = new Random();  // Random number generator
        for (int i=0; i<array.length; i++) {
            int randomPosition = rgen.nextInt(array.length);
            Room temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }
        return array;
    }

    public void play() {
        System.out.println("Welcome to the dungeon! Someone has barred the door behind you. The only way out is find another exit.");

        monster1 = new Room();
        monster1.setIsMonsterInside(true);
        monster1.setDoorDescription("You have found a large wooden door that is latched from the outside. Do you enter \"E\" or Go Back \"B\"");
        monster1.setMonsterStory( "You unlock the door and slowly push the door open. As you enter the room a small candle on the table catches your attention. As you are mesmerized by the flame, you fail to notice the witch who casts a spell to turn you to stone. You will forever adorn her room. You have died.");

        monster2 = new Room();
        monster2.setIsMonsterInside(true);
        monster2.setDoorDescription("You are standing in front of a large metal door that is ajar");
        monster2.setMonsterStory("You push the massive door open. You are now thirsty from doing all that work, but luckily you see a pool of water across the room. The water looks clean enough and you decide to start drinking the water. While you are drinking the water a golden glimmer coming from the water catches your eye. You reach for it. But right before you are able to grab the object, an unseen force grabs you and pulls you into the deep water. You kick and punch but your efforts are useless. As the last bit of air slips out of your lungs and through your lips, you drown");

        brasskey = new Room();
        brasskey.setIsKeyInside(true);
        brasskey.setRoomDiscryption("You walk down the hallway in front of you and come to a room with a broken door. You walk inside and it looks like no one has been there in years. A shiny brass object catches your eye and you go to pick it up. **You Picked Up A Key** You are now standing back at the intersection next to the crawl space. Do you move to the North (\"n\"), West (\"w\"), or South (\"s\"), and go back through the crawlspace");

        exit = new Room();
        exit.setRoomDiscryption("You come to a large metal door. The door is locked and wont seem to move no matter how hard you push. Your only option is to go back to the intersection next to the crawlspace. You are now standing back at the intersection next to the crawl space. Do you move to the North (\"n\"), West (\"w\"), or South (\"s\"), and go back through the crawlspace");


        Room[] rooms = new Room[4];
        rooms[0] = monster1;
        rooms[1] = monster2;
        rooms[2] = brasskey;
        rooms[3] = exit;

        rooms = RandomizeArray(rooms);

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
                    boolean isGameOver2 = showDoorDis(rooms[0]);
                    if (!isGameOver2) {
                        System.out.println("You can choose to enter the room ahead \"E\", or turn back to the previous intersection \"B\"");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("e")) {
                            showRoomDis(rooms[0]);
                        } else if (move.toLowerCase().trim().equals("b")) {
                            currentPos = 1;
                        } else {
                            System.out.println("Invalid direction. Only \"E\" and \"B\" are valid");
                        }
                    }
                    break;
                case 3:
                    boolean isGameOver3 = showDoorDis(rooms[1]);
                    if (!isGameOver3) {
                        System.out.println("You can choose to enter the room ahead \"E\", or turn back to the previous intersection \"B\"");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("e")) {
                           showRoomDis(rooms[1]);
                        } else if (move.toLowerCase().trim().equals("b")) {
                            currentPos = 1;
                        } else {
                            System.out.println("Invalid direction. Only \"E\" and \"B\" are valid");
                        }
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
                    boolean isGameOver6 = showDoorDis(rooms[2]);
                    if (!isGameOver6) {
                        System.out.println("You can choose to enter the room ahead \"E\", or turn back to the previous intersection \"B\"");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("e")) {
                            showRoomDis(rooms[2]);
                            currentPos = 5;
                        } else if (move.toLowerCase().trim().equals("b")) {
                            currentPos = 5;
                        }
                    }

                    System.out.println(brasskey.getRoomDiscryption());
                        /*System.out.println("You walk down the hallway in front of you and come to a room with a broken door");
                        System.out.println("You walk inside and it looks like no one has been there in years");
                        System.out.println("A shiny brass object catches your eye and you go to pick it up");
                        System.out.println("**You Picked Up A Key**");
                        System.out.println("You are now standing back at the intersection next to the crawl space");
                        System.out.println("Do you move to the North (\"n\"), West (\"w\"), or South (\"s\"), and go back through the crawlspace");*/
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
                        System.out.println(exit.getRoomDiscryption());
                            /*System.out.println("You come to a large metal door");
                            System.out.println("The door is locked and wont seem to move no matter how hard you push");
                            System.out.println("Your only option is to go back to the intersection next to the crawlspace");
                            System.out.println("You are now standing back at the intersection next to the crawl space");
                            System.out.println("Do you move to the North (\"n\"), West (\"w\"), or South (\"s\"), and go back through the crawlspace");*/
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
    private boolean showDoorDis(Room room) {
        if (room.getIsExit()){
            if (key == false) {
                System.out.println(room.getRoomDiscryption());
            } else if (key == true) {
                System.out.println("You approach the large metal door");
                System.out.println("This time you notice a small key hole");
                System.out.println("You reach into your pocket to grab the key you found");
                System.out.println("You slide it into the key whole and twist it");
                System.out.println("You hear two loud metallic sounds and the door slowly starts to open");
                System.out.println("You are greeted by a blinding light but as your eyes adjust you can see that you made it to the surface");
                System.out.println("**Level 1 Passed**");
                currentPos = -1;
                return true; //finishes the game
            }
        } else {
            System.out.println(room.getDoorDescription());
        }
        return false; //Game is not over yet
    }
    private boolean showRoomDis (Room room) {
        if (room.getIsMonsterInside()) {
            System.out.println(room.getMonsterStory());
            currentPos = -1;
            return true;
        } else if (room.getIsKeyInside()) {
            System.out.println(room.getRoomDiscryption());
            key = true; //give player the key
            return false;
        } else
            return false;
    }
}