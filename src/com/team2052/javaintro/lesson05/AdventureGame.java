package com.team2052.javaintro.lesson05;

import java.util.Scanner;


public class AdventureGame {
    private int currentPos = 0; //keeps track of the current location, set to the beginning of the maze, position 0
    private Scanner scanner = null; //object to get user input from command line
    private String move = null; //reuse the variable to collect user input
    //int scrolls = 10;
    boolean scrolls;
    boolean lichAlive;
    boolean trapDone = false;
    boolean trap1IsComplete = false;
    boolean trap2IsComplete = false;
    boolean trap3IsComplete = false;

    public AdventureGame() {
        scanner = new Scanner(System.in);
    }

    public void play()
    {
        boolean scrolls = false;
        boolean lichAlive = true;
        System.out.println("\n\n\n\n\n\n\n\n\n\nYou stare up at the dim light coming from the top of the hole you fell in.");
        System.out.println("\nThe slimey, moss covered stone is far to difficult to climb.");
        System.out.println("\nA voice echo's through the small cavern.");
        System.out.println("\nBeware, young adventurer, the only way forward is north.\n");
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
                    System.out.println("");
                    System.out.println("A warm glow is provided by the litchen on the ceiling and hangs off the ruins of a chandelier.");
                    System.out.println("");
                    if (scrolls)
                    {
                        System.out.println("There are four novel rooms you could visit, and of course, the niche the hole lead to behind you.");
                        System.out.println("");
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
                        } else if (move.toLowerCase().trim().equals("c")) {
                            currentPos = 5;
                        } else {
                            System.out.println("Invalid direction. Only \"N\", \"S\", \"E\", \"W\",  are valid");
                        }
                    }

                    else
                    {
                    System.out.println("There are four novel rooms you could visit, and of course, the niche the hole lead to behind you.");
                    System.out.println("");
                    System.out.println("Your options are 'n' 's' 'e' 'w' ");
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
                    }
                    break;
                case 2:
                    if(lichAlive)
                    {
                        System.out.println("You have found a large wooden door that is latched from the outside.");
                        System.out.println("");
                        System.out.println("A low clinking noise can be heard through the door.");
                        System.out.println("");
                        System.out.println("Mist pools around your feet.");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Do you enter 'e' to enter, or 'b' to return?");
                        System.out.println(".    .");
                        move = scanner.nextLine();
                            if (move.toLowerCase().trim().equals("e")) {
                            System.out.println("\n\n\nYou unlock the door and slowly push the it open.");
                            System.out.println("\nAs you cross the threshold, green flames errupt from the stone torches on the wall");
                            System.out.println("\nThe door locks behind you.");
                            System.out.println("\n\nIn the center of the stone floor is an eleaboratly decorated trap door");
                            System.out.println("\nBut what really catches your eye, is the body suspended over it.");
                            System.out.println("\nEach limb is anchored to the floor or the ceiling by a chain.");
                            System.out.println("\nYou step towards the trap door");
                            System.out.println("\n\nThe humidity of the chamber rises, you feel like you're drowning in your own skin.");
                            System.out.println("\nLow echoing laugh fills the room.");
                            System.out.println("\nThe head on the body snaps up, as if awakened.");
                            System.out.println("\n\nIt looks straight at you, grinning");
                            System.out.println("\n 'You really thought I was asleep? Well perhaps I dozed a little.'");
                            System.out.println("\n 'Aren't I glad for the innteruption! Oh, there's no where to go now!' ");
                            System.out.println("\nThe lich can't move, but his aura is substantial.");
                            System.out.println("\n 'I don't take well to cowardice, so come on! I can't promise a painless death, but at least you'll have tried!' ");
                            System.out.println("\n\nPlease enter a number between 1-100.\n");
                            int number1 = scanner.nextInt();
                            BattleNumber favorite1 = BattleNumber.getInstance();
                            favorite1.setMyNumber(number1);
                                if (number1 > 35 )
                                    {
                                        System.out.println("\n 'I'm truly amazed, your power level...' ");
                                        System.out.println(" 'It's lower than anything I've ever seen!' ");
                                        System.out.println("\nYou lose your balance, sudden dizzyness overcoming you.");
                                        System.out.println("\nEmerald colored smoke fills your lungs.");
                                        System.out.println("\nThe last thing you hear is the lich's voice.");
                                        System.out.println("\n 'You should have been more humble, young adventurer!' ");
                                        System.out.println("\nYou died.");
                                        currentPos = 0;
                                    }
                                if (number1 < 35 )
                                    {
                                        System.out.println("\nYou don't have a weapon but...");
                                        System.out.println("\nRunning, you grab one of the torches on the wall.");
                                        System.out.println("\nYou bare it's heat until you get close enought to the lich. After all, he can't move.");
                                        System.out.println("\nThe rags on the nearly decomposed body ignite easily.");
                                        System.out.println("\n 'I know, why aren't I fighting? Don't I have something to protect?' ");
                                        System.out.println("\nThe flames climb higher. He leans down toward you.");
                                        System.out.println(" \n 'When you've been undead as long as I have, nothing really matters anymore.' ");
                                        System.out.println("\nThe lich burns, chains and all. A new dust falls upon the floor.");
                                        System.out.println("\nYou won!");
                                        System.out.println("\n \n \n ");
                                        currentPos = 21;
                                    }
                                if (number1 == 35)
                                    {
                                        System.out.println("You don't have a weapon but...");
                                        System.out.println("\nRunning, you grab one of the torches on the wall.");
                                        System.out.println("\nYou bare it's heat until you get close enought to the lich. After all, he can't move.");
                                        System.out.println("\nThe rags on the nearly decomposed body ignite easily.");
                                        System.out.println("\n 'I know, I know, why aren't I fighting? Don't I have something to protect?' ");
                                        System.out.println("\nThe flames climb higher. He leans down toward you.");
                                        System.out.println("\n 'When you've been undead as long as I have, nothing really matters anymore.' ");
                                        System.out.println("\n The lich burns, chains and all. A new dust falls upon the floor.");
                                        System.out.println("\nYou won!");
                                        System.out.println("\n\n The same whispery voice you first heard when you fell into this dunegon speaks again.");
                                        System.out.println("\n 'What... intuition. It isn't often someone like that comes along.");
                                        System.out.println("\nYour pocket has a certain heft that wasn't there before.");
                                        System.out.println("\nYou reach, and produce a teardrop ruby ammulet.");
                                        System.out.println("\nIt sits perfectly around your neck\n\n\n");
                                        currentPos = 21;
                                    }
                                //currentPos = -1;
                            } else if (move.toLowerCase().trim().equals("b")) {
                                System.out.println("\n\nYou notice a dusty plaque next to the door.");
                                System.out.println("\nYou reach out and brush it off.");
                                System.out.println("\nIt reads:");
                                System.out.println("\n\nLong ago when man thought he conquered gods.");
                                System.out.println("\nA dark and powerful foe was made.");
                                System.out.println("\nLiving to dead, now stands on death's treasure.");
                                System.out.println("\nTo stay until the world decays.");
                                System.out.println("\n\n\nCreepy...");
                                currentPos = 1;
                            }else {
                            System.out.println("Invalid direction. Only \"E\" and \"B\" are valid");
                            }
                            break;
                        }
                    else
                    {
                        System.out.println("\n The door still stands ajar");
                        System.out.println("\nAs you enter, a chill seeps through you");
                        System.out.println("\nIt's as if the lich's haunted laughter still fills the hall.");
                        System.out.println("\nThe torches now flicker yellow, the emerald hue lost.");
                        currentPos = 21;
                        break;
                    }

                    case 21:
                    System.out.println("");
                    System.out.println("");
                    System.out.println(" The trap door once guarded by the lich now opens.");
                    System.out.println("");
                    System.out.println(" Do you continue? ");
                    System.out.println(" 'E' to enter, 'B' to go back to the cavern");
                    move = scanner.nextLine();
                    if (move.toLowerCase().trim().equals("e")) {
                        currentPos = 22;
                    } else if (move.toLowerCase().trim().equals("b")) {
                        currentPos = 1;
                    } else {
                        System.out.println("Invalid direction. Only \"E\" and \"B\" are valid");
                    }
                    break;

                    case 22:
                    System.out.println("A set of stairs lead down to a dimly lit tunnel.");
                    System.out.println("\nThe ground here isn't the polished stone like above.");
                    System.out.println("\nHard packed earth lines the floor and walls. Crude timber supports hold the ceiling, at least they look sturdy.");
                    System.out.println("\nA short walk leads you to another set of doors.");
                    System.out.println("\nThey open at the slightest touch.");
                    System.out.println("\nA simple pedestal stands at the back of the small room.");
                    System.out.println("\nThe walls are adorned with symbols carved into the solid dirt");
                    System.out.println("\nBased on the repetion, and punctuation, they must be a language.");
                    System.out.println("\nOn the pedestal, there's an ancient but sturdy looking scroll.");
                    System.out.println("\nThe scroll rests on the left side of the stand, with the right exposed, but free of dust.");
                    System.out.println("\nAs you weigh the decision of talking the scroll, you place your hand on the open wood.");
                    System.out.println("\nIt begins to glow as recessed gemstones come up. It warms under your touch.");
                    System.out.println("\nWhispers stream from the runes on the walls");
                    System.out.println("\n 'go on,' they chorus, 'take it'");
                    System.out.println("\n\nDo you take the scrolls?");
                    System.out.println("\n 'E' to take the scrolls, 'B' to decide not to.");
                    
                    move = scanner.nextLine();
                    if (move.toLowerCase().trim().equals("e")) {
                        System.out.println("\nThe scroll is sturdy despite its age.");
                        System.out.println("\nThe floor begins to tremble, did you make the wrong choice?");
                        System.out.println("\nTiles beneath you crumble.");
                        System.out.println("\nAs you fall you hear the lich's laughter.");
                        System.out.println("\n\n\nYou sit up, shaking the fogginess from your head.");
                        scrolls = true;
                        currentPos = 1;
                    } else if (move.toLowerCase().trim().equals("b")) {
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("You wrench your hand away from the podium");
                        System.out.println("");
                        System.out.println("As you run back towards the main cavern, the warm glow of the room dies behind you.");
                        currentPos = 1;
                    } else {
                        System.out.println("Invalid direction. Only \"E\" and \"B\" are valid");
                    }
                    break;

                    case 5:
                    System.out.println("You head north, using your hand to guide you along the dim passage.");
                    System.out.println("As you walk, you feel you hand catch on a groove in the wall.");
                    System.out.println("You pause... it couldn't be...");
                    System.out.println("e to investigate further, b to continue on.");
                    move = scanner.nextLine();
                    if (move.toLowerCase().trim().equals("e")) {
                        System.out.println("Pressing your hand into the rut, you feel it continue up the wall.");
                        System.out.println("You reach, finding a spot that fits your hand.");
                        System.out.println("The seemingly random cracks in the wall begin to glow.");
                        System.out.println("A small rumbling begins near your feet.");
                        System.out.println("Now illuminated, you see that they weren't cracks at all.");
                        System.out.println("The same runes as the scroll cavern shine a coral light.");
                        System.out.println("You look down, and see a small door has opened.");
                        System.out.println("It seems to be about three feet in height, if you crawl...");
                        System.out.println("w to enter, z to return.");
                        move = scanner.nextLine();
                        if (move.toLowerCase().trim().equals("w")) {
                            System.out.println("\nDucking, you crawl through the miniature door");
                            System.out.println("\nYou now stand in what seems to be a miniature town");
                            System.out.println("\nA bustling village center is surrounded by rolling fields and edged by a forest");
                            System.out.println("\n 'Excuse me!' someone squeeks from behind you");
                            System.out.println("\nYou back up against the wall, and man moves around your feet.");
                            System.out.println("\nHe couldn't be more than ten inches tall.");
                            System.out.println("\nLooking over the town, you spot a clearing in the forest at the other end of the room.");
                            System.out.println("\nSomething gold glints in it's center. A key?...");
                            //double trap = 0.7;//Math.random() * 3;
                            //System.out.println(trap);
                            // if (trap < 1){
                            //     currentPos = 0;
                            //     System.out.println("Trap 1");
                            //     System.out.println("\nYou move forward, trying your best to avoid the rest of the village.");
                            //     System.out.println("\nUp head, there seems to be a large dirt circle");
                            //     System.out.println("\nWhat a nice place to rest, after all the roads out here are just barely as wide as your two feet.");
                            //     System.out.println("\nTake a rest (e), or stick to the path (b)");
                            //     move = scanner.nextLine();
                            //     if (move.toLowerCase().trim().equals("e")){
                            //         System.out.println("\n\nYou flop down, so relieved to be off your feet.");
                            //         System.out.println("\nHowever, you failed to notice the intricate webbing underneath you.");
                            //         System.out.println("\nYou're pulled up towards the ceiling, it seems the rope--no, silk--is quite strong.");
                            //         System.out.println("\nFour sets of rougish, beady eyes desend down towards you.");
                            //         System.out.println("\nAt the sight of the spider's fangs, you faint.");
                            //         trapDone = true;
                            //         currentPos = 0;
                            //     }
                            //     else if (move.toLowerCase().trim().equals("b")){
                            //         System.out.println("\n B");
                            //         System.out.println("\n You continue on towards the ");
                            //         trap = 1.5;
                            //     }
                            // }
                            // if (trap >= 1 == trap < 2){
                            //     currentPos = 1;
                            //     System.out.println("Trap 2");
                            // }
                            // if (trap > 2){
                            //     currentPos = 2;
                            //     System.out.println("Trap 3");
                            // }
                            
                            while (true){
                                if{

                                }else(trap1IsComplete && trap2IsComplete && trap3IsComplete){

                                }
                            }
                            
                            
                            

                        } else if (move.toLowerCase().trim().equals("z")) {
                            currentPos = 1;
                        }else {
                            System.out.println("Invalid choice. Only \"E\" and \"B\" are valid");
                        }

                    } else if (move.toLowerCase().trim().equals("b")) {
                        currentPos = 1;
                    } else {
                        System.out.println("Invalid choice. Only \"E\" and \"B\" are valid");
                    }
                    break;

                    case 1000:
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