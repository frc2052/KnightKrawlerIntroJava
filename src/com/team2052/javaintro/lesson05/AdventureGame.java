package com.team2052.javaintro.lesson05;

import java.util.Scanner;

public class AdventureGame {
    private int currentPos = 0; //keeps track of the current location, set to the beginning of the maze, position 0
    private Scanner scanner = null; //object to get user input from command line
    private String move = null; //reuse the variable to collect user input

    public AdventureGame() {
        scanner = new Scanner(System.in);
    }

    public void play()
    {
        System.out.println("You stare up at the dim light coming from the top of the hole you fell in.");
        System.out.println("The slimey, moss covered stone is far to difficult to climb.");
        System.out.println("A voice echo's through the small cavern.");
        System.out.println("Beware, young adventurer, the only way forward is north.");
        while (currentPos >= 0) {
            switch (currentPos)
            {
                case 0:
                    System.out.println("You are at the entrance to a large cavern. Type \"N\" to go north.");
                    move = scanner.nextLine();
                    if (move.toLowerCase().trim().equals("n"))
                    {
                        currentPos = 1;
                    } else {
                        System.out.println("The voice trills louder in frustration 'Conniving scum! Complete the dungeon with honor!' Remember, only north is valid.");
                    }
                    break;
                case 1:
                    System.out.println("You now stand in a large cavern.");
                    System.out.println("A warm glow is provided by the litchen on the ceiling and hangs off the ruins of a chandelier.");
                    System.out.println("There are four novel rooms you could visit, and of course, the niche the hole lead to behind you.");
                    System.out.println("Your options are 'n' 's' 'e' 'w' 'c' ");
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
                    System.out.println("You have found a large wooden door that is latched from the outside.");
                    System.out.println("A low clinking noise can be heard through the door.");
                    System.out.println("Mist pools around your feet.");
                    System.out.println("Do you enter 'e' to enter, or 'b' to return?");
                    System.out.println(".    .");
                    move = scanner.nextLine();
                    if (move.toLowerCase().trim().equals("e")) {
                        System.out.println(".    .");
                        System.out.println(".    .");
                        System.out.println(".    .");
                        System.out.println("You unlock the door and slowly push the it open.");
                        System.out.println("As you cross the threshold, green flames errupt from the stone torches on the wall");
                        System.out.println("The door locks behind you.");
                        System.out.println(".    .");
                        System.out.println("In the center of the stone floor is an eleaboratly decorated trap door");
                        System.out.println("But what really catches your eye, is the body suspended over it.");
                        System.out.println("Each limb is anchored to the floor or the ceiling by a chain.");
                        System.out.println("You step towards the trap door");
                        System.out.println(".    .");
                        System.out.println("The humidity of the chamber rises, you feel like you're drowning in your own skin.");
                        System.out.println("Low echoing laugh fills the room.");
                        System.out.println("The head on the body snaps up, as if awakened.");
                        System.out.println(".    .");
                        System.out.println("It looks straight at you, grinning");
                        System.out.println("'You really thought I was asleep? Well perhaps I dozed a little.'");
                        System.out.println(" 'Aren't I glad for the innteruption! Oh, there's no where to go now!' ");
                        System.out.println(" The lich can't move, but his aura is substantial.");
                        System.out.println(" 'I don't take well to cowardice, so come on! I can't promise a painless death, but at least you'll have tried!' ");
                        System.out.println(".    .");
                        System.out.println("Please enter a number between 1-100.");
                        System.out.println(".    .");
                        int number1 = scanner.nextInt();
                        BattleNumber favorite1 = BattleNumber.getInstance();
                        favorite1.setMyNumber(number1);
                        if (number1 > 35 )
                            {
                                System.out.println(".    .");
                                System.out.println(" 'I'm truly amazed, you're power level...' ");
                                System.out.println(" 'It's lower than anything I've ever seen!' ");
                                System.out.println(".    .");
                                System.out.println("You lose your balance, sudden dizzyness overcoming you.");
                                System.out.println("Emerald colored smoke fills your lungs.");
                                System.out.println(".    .");
                                System.out.println("The last thing you hear is the lich's voice.");
                                System.out.println(" 'You should have been more humble, young adventurer!' ");
                                System.out.println("You died.");
                                currentPos = 0;
                            }
                        if (number1 < 35 )
                            {
                                System.out.println(" You don't have a weapon but...");
                                System.out.println(" Running, you grab one of the torches on the wall.");
                                System.out.println("You bare it's heat until you get close enought to the lich. After all, he can't move.");
                                System.out.println("The rags on the nearly decomposed body ignite easily.");
                                System.out.println(" 'I know, why aren't I fighting? Don't I have something to protect?' ");
                                System.out.println("The flames climb higher. He leans down toward you.");
                                System.out.println(" 'When you've been undead as long as I have, nothing really matters anymore.' ");
                                System.out.println(" The lich burns, chains and all. A new dust falls upon the floor.");
                                System.out.println("You win!");
                            }
                        if (number1 == 35)
                            {
                                System.out.println("You win and teasure!");
                            }
                        //System.out.println("your number is" + number1);
                        currentPos = -1;
                    } else if (move.toLowerCase().trim().equals("b")) {
                        System.out.println("     ");
                        System.out.println("     ");
                        System.out.println("You notice a dusty plaque next to the door.");
                        System.out.println("You reach out and brush it off.");
                        System.out.println("     ");
                        System.out.println("It reads:");
                        System.out.println("     ");
                        System.out.println("Long ago when man thought he conquered gods.");
                        System.out.println("A dark and powerful foe was made.");
                        System.out.println("Living to dead, now stands on death's treasure.");
                        System.out.println("To stay until the world decays.");
                        System.out.println("     ");
                        System.out.println("     ");
                        System.out.println("Creepy...");
                        currentPos = 1;
                    } else {
                        System.out.println("Invalid direction. Only \"E\" and \"B\" are valid");
                    }
                    break;
                    case 3:
                    System.out.println("You have found a large wooden door that is latched from the outside. Do you enter \"E\" or Go Back \"B\"");
                    move = scanner.nextLine();
                    if (move.toLowerCase().trim().equals("e")) {
                        
                    } else if (move.toLowerCase().trim().equals("b")) {
                    } else {
                        System.out.println("Invalid direction. Only \"E\" and \"B\" are valid");
                    }
                    break;

                    case 4:
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
            }
        }
    }
}