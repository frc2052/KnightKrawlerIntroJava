package com.team2052.javaintro.lesson05;

import java.util.Scanner;


public class AdventureGame {
    private int currentPos = 0; //keeps track of the current location, set to the beginning of the maze, position 0
    private Scanner scanner = null; //object to get user input from command line
    private String move = null; //reuse the variable to collect user input
    //int scrolls = 10;
    private boolean scrolls;
    private boolean lichAlive;
    private boolean ammulet = false;
    private boolean trapDone = false;
    private int index;
    private boolean trap1IsComplete = false;
    private boolean trap2IsComplete = false;
    private boolean trap3IsComplete = false;
    private boolean allTrapsDone = false;
    private boolean key = false;
    private boolean runChair = false;
    private boolean runDesk = false;
    private boolean runMantel = false;
    int luck;

    public AdventureGame() {
        scanner = new Scanner(System.in);
    }

    public void play()
    {
        scrolls = false;
        lichAlive = true;
        trap3IsComplete = false;
        trap1IsComplete = false;
        trap2IsComplete = false;
        allTrapsDone = false;
        key = false;
        runChair = false;
        runDesk = false;
        runMantel = false;
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
                                        ammulet = true;
                                        currentPos = 21;
                                    }
                                //currentPos = -1;
                            } else if (move.toLowerCase().trim().equals("b")) {
                                System.out.println("\n\nYou notice a dusty plaque next to the door.");
                                System.out.println("\nReaching out and you brush it off.");
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
                    System.out.println("\n\nThe trap door once guarded by the lich now opens.");
                    System.out.println("\nDo you continue? ");
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
                    
                            if (!trap1IsComplete || !trap2IsComplete || !trap3IsComplete)
                            {
                                //print traps.
                                System.out.println("You walk ahead, using your hand to guide you along the dim passage.");
                                System.out.println("As you walk, you feel you hand catch on a groove in the wall.");
                                System.out.println("You pause... it couldn't be...");
                                System.out.println("e to investigate further, b to continue on.");
                                move = scanner.nextLine();
                                if (move.toLowerCase().trim().equals("e")) {
                                    System.out.println("\nPressing your hand into the rut, you feel it continue up the wall.");
                                    System.out.println("\nYou reach, finding a spot that fits your hand.");
                                    System.out.println("\nThe seemingly random cracks in the wall begin to glow.");
                                    System.out.println("\nA small rumbling begins near your feet.");
                                    System.out.println("\nNow illuminated, you see that they weren't cracks at all.");
                                    System.out.println("\nThe same runes as the scroll cavern shine a coral light.");
                                    System.out.println("\nYou look down, and see a small door has opened.");
                                    System.out.println("\nIt seems to be about three feet in height, if you crawl...");
                                    System.out.println("\nw to enter, z to return.");
                                    move = scanner.nextLine();
                                    if (move.toLowerCase().trim().equals("w")) 
                                    {
                                        System.out.println("\nDucking, you crawl through the miniature door");
                                        System.out.println("\nYou now stand in what seems to be a miniature town");
                                        System.out.println("\nA bustling village center is surrounded by rolling fields and edged by a forest");
                                        System.out.println("\n 'Excuse me!' someone squeeks from behind you");
                                        System.out.println("\nYou back up against the wall, and man moves around your feet.");
                                        System.out.println("\nHe couldn't be more than ten inches tall.");
                                        System.out.println("\nLooking over the town, you spot a clearing in the forest at the other end of the room.");
                                        System.out.println("\nSomething gold glints in it's center. A key?...");
                                            while ((!trap1IsComplete || !trap2IsComplete || !trap3IsComplete) && currentPos == 5){
                                                index = (int)(Math.random()*3);
                                                if (index == 0 && !trap1IsComplete ){
                                                    System.out.println("\nYou move forward, trying your best to avoid the rest of the village.");
                                                    System.out.println("\nUp head, there seems to be a large dirt circle");
                                                    System.out.println("\nWhat a nice place to rest, after all the roads out here are just barely as wide as your two feet.");
                                                    System.out.println("\nTake a rest (e), or stick to the path (b)");
                                                    move = scanner.nextLine();
                                                    if (move.toLowerCase().trim().equals("e")){
                                                        System.out.println("\n\nYou flop down, so relieved to be off your feet.");
                                                        System.out.println("\nHowever, you failed to notice the intricate webbing underneath you.");
                                                        System.out.println("\nYou're pulled up towards the ceiling, it seems the rope--no, silk--is quite strong.");
                                                        System.out.println("\nFour sets of rougish, beady eyes desend down towards you.");
                                                        System.out.println("\nAt the sight of the spider's fangs, you faint.");
                                                        PlayerDeath();
                                                        trap1IsComplete = true;
                                                    }else if (move.toLowerCase().trim().equals("b")){
                                                        System.out.println("\n");
                                                        System.out.println("\n You continue on towards the key");
                                                        System.out.println("\nBetter to be mindful where a misstep could be a mass murder.");
                                                        trap1IsComplete = true;
                                                    }
                                                        
                                                }else if (index == 1 && !trap2IsComplete){
                                                    System.out.println("\nMoving through the forest, you get a strange sense of peacefulness.");
                                                    System.out.println("\nBirds eye view at a whole nother level!");
                                                    System.out.println("\nA small stone path stands before you.");
                                                    System.out.println("\nAdorable! If only you had a sketchbook!");
                                                    System.out.println("\nAs you walk, a strange ticking rises above the whispering of the trees.");
                                                    System.out.println("\nYou stop, turning to see the broken tripwire behind you.");
                                                    System.out.println("\nBy the time you think to run, the poison from the miniature arrows is already working.");
                                                    trap2IsComplete = true;
                                                    PlayerDeath();

                                                }else if (index == 2 && !trap3IsComplete){
                                                    System.out.println("\nYou begin to skirt around a village farm.");
                                                    System.out.println("\nA herd of toy sized sheep are grazing nearby.");
                                                    System.out.println("\nA farmhouse and barn stand a few feet off, inbetween are crops.");
                                                    System.out.println("\nThe gap between the wall and the pasture narrows.");
                                                    System.out.println("\nYou see a farmer running towards you.");
                                                    System.out.println("\nRun (w) or confront her (z)");
                                                    move = scanner.nextLine();
                                                    if (move.toLowerCase().trim().equals("w")){
                                                        System.out.println("\nYou start backing away, carefully, but as you do so her frustration increases.");
                                                        System.out.println("\nShe may be one eighth your size, but that doesn't change how scary she is. ");
                                                        System.out.println("\nYou hesitate, then move with abandon.");
                                                        System.out.println("\nThe sheep cry out as you crush the fencing on the pasture.");
                                                        System.out.println("\nYou trip, causing what must seem like an earthquake to these people.");
                                                        System.out.println("\nSooner than you would have imagined, a crowd forms.");
                                                        System.out.println("\nFarmers, with weapons who don't seem too pleased.");
                                                        if (ammulet == true){
                                                            System.out.println("\nYou sit up");
                                                            System.out.println("\nThe ammulet surfaces from under your tunic");
                                                            System.out.println("\nIt hangs, gleaming.");
                                                            System.out.println("\nAll eyes around you are transfixed upon it.");
                                                            System.out.println("\nMakes sense, they are dwarves.");
                                                            System.out.println("\nYou remove the ammulet from your neck and set it on the ground.");
                                                            System.out.println("\nAs they crowd around it, you continue on towards the key.");
                                                            ammulet = false;
                                                            trap3IsComplete = true;
                                                        }
                                                        else if (ammulet == false){
                                                            System.out.println("\nThe bleating of the animals intensifies with their shouts.");
                                                            System.out.println("\nSurrounded, they desend upon you.");
                                                            trap3IsComplete = true;
                                                            break;
                                                        }
                                                    }else if (move.toLowerCase().trim().equals("z")){
                                                        System.out.println("\nYou stand you ground as she approaches.");
                                                        System.out.println("\nShe must be shouting but her voice is difficult to hear.");
                                                        System.out.println("\nYou move backward, giving yourself enough room to kneel.");
                                                        System.out.println("\nAs you do so, she moves back.");
                                                        System.out.println("\nHer jawline relaxes, perhaps kneeling is a sign of respect?");
                                                        System.out.println("\nYou begin to apoligize for trespassing but she stops you.");
                                                        System.out.println("\nYou lean down to hear her better, her voice is almost a whisper.");
                                                        System.out.println("\n 'Thanks, you can go on as long as you stay away from the sheep'");
                                                        System.out.println("\nWhat a relief to be forgiven!");
                                                        System.out.println("\nYou move on towards the key.");
                                                        trap3IsComplete = true;
                                                    }
                                                    
                                                }//trap 3 end bracket
                                            }//while loop end bracket

                                    }else if (move.toLowerCase().trim().equals("z")) 
                                    {
                                        currentPos = 1;
                                    }
                                    else 
                                    {
                                        System.out.println("Invalid choice. Only \"E\" and \"B\" are valid");
                                    }

                                } else if (move.toLowerCase().trim().equals("b")) {
                                    currentPos = 1;
                                } else {
                                    System.out.println("Invalid choice. Only \"E\" and \"B\" are valid");
                                }
                            }else{
                                System.out.println("\nThe key is finally within reach!");
                                System.out.println("\nIt's larger than you expected, but the head of the key fits snug in your hand. ");
                                System.out.println("\nIt's a shining copper tone, with a silver chain attached.");
                                System.out.println("\nYou slip the chain over your head, and head to the center cavern.");
                                key = true;
                                currentPos = 1;
                                }
                    break;

                    case 3:
                        System.out.println("\nThe hallways leads to a massive wooden door.");
                        System.out.println("\nA brass faced knocker hangs just above your head.");
                        System.out.println("\nIt too, is enormous.");
                        System.out.println("\nYou summon all of your strength, but fail to lift it.");
                        System.out.println("\nYou jump to reach again, but the face on the knocker contorts in disgust.");                                
                        System.out.println("\n  'Honestly! If you wanted to be in, you could have just rung!'");
                        System.out.println("\nHer eyes flick down to a plaque at your waist.");
                        System.out.println("\nIt reads,");
                        System.out.println("\n  Ring bell if ye cannot grasp thy door knock.");
                        System.out.println("\n  'Exactly! You ought to be more observant.'");
                        System.out.println("\nShe sniffs, and once again becomes brass as you pull the bell cord.");
                        System.out.println("\nThe door swings open.");
                        currentPos = 32;
                        break;

                    case 32:
                    System.out.println("\nYou get the sense that you must have shrunk.");
                    System.out.println("\nThe fireplace is thrice your height and you would have to jump to get on the loveseat.");
                    System.out.println("\nBesides your seemingly small stature, the room seems tall.");
                    System.out.println("\nYou search to find the ceiling, but all you can see is darkness.");
                    System.out.println("\nWell, darkness pierced by a dusty, yet warmly lit chandelier.");
                    System.out.println("\nA miniature--or rather normal--sized doll house stands to your right.");
                    System.out.println("\nA great array of goods and foodstuffs are laid out upon the table in it.");
                    System.out.println("\nYour stomach rumbles, but the writing desk to your left also catches your attention.");
                    System.out.println("\nA letter hangs off the desk, just out of reach.");
                    System.out.println("\ne to satifisy your hunger, b to satisfy your curiosity.");
                    move = scanner.nextLine();
                    if (move.toLowerCase().trim().equals("e")) {
                        System.out.println("\nYou creep inside what must be a dollhouse.");
                        System.out.println("\nAs you asses the feast laid out before you, the house quakes.");
                        System.out.println("\nYou turn, seeing the side of the house close off.");
                        System.out.println("\nA little boy looks in at you with delight.");
                        System.out.println("\nThere's no escape now...");
                        PlayerDeath();
                    }if (move.toLowerCase().trim().equals("b")) {
                        currentPos = 33;
                        
                    }
                    else{System.out.println("Invalid choice. Only \"E\" and \"B\" are valid");}

                    break;

                    case 33:
                    System.out.println("\nYou jump, and though you don't quite grab it, the letter comes floating down.");
                    System.out.println("\nNo sooner is it in your hands, than a little boy comes running in.");
                    System.out.println("\n  'No, no, no!' he cries");
                    System.out.println("\n  'You were supposed to go an eat!'");
                    System.out.println("\nHe begins to chase you, but he is slow and clumsy due to his tear filled eyes.");
                    System.out.println("\nYou too, are clumsy, lugging the letter around.");
                    while ((!runChair || !runDesk || !runMantel) && currentPos == 33){
                        index = (int)(Math.random()*3);
                        if(index == 0 && !runChair){
                            System.out.println("\nYou dart under the chair");
                            System.out.println("\nHe slows, perhaps he didn't see you?");
                            System.out.println("\nThe chair legs are thin, but so are you at this scale.");
                            System.out.println("\n  Hide [e], or seek more cover?[b]");
                            move = scanner.nextLine();
                            if (move.toLowerCase().trim().equals("e")) {
                                System.out.println("\nYou lose your balance in what seems like an earthquake.");
                                System.out.println("\nYou look up, the boy's face grotesquely large.");
                                System.out.println("\nHis hand moves faster than you could possibly imagine.");
                                System.out.println("\nHis grasp is sticky, stifilingly hot and crushing.");
                                PlayerDeath();
                            }if (move.toLowerCase().trim().equals("b")) {
                                System.out.println("\nOnce you hear footsteps no longer, you move out.");
                                System.out.println("\nYou can't see him at first");
                                System.out.println("\nThen you spot him, looking around the door.");
                               
                                runChair = true;
                            }
                        }
                        if(index == 1 && !runDesk){
                            luck = (int)(Math.random()*10);
                            if (luck >= 5){
                                System.out.println("\nYou run, letter across your back under the desk.");
                                System.out.println("\nIt is deeper than you thought, but the darkness is welcome.");
                                System.out.println("\nYou position the letter in just enough light to read.");
                                LetterRead();
                                runDesk = true;
                            }
                            if (luck <= 4){}
                            System.out.println("\nAs you run, the rug seems to swallow you, as if you were trying to run in water.");
                            System.out.println("\nYou toss the letter in an attempt to distract him, but his sights are set.");
                            System.out.println("You brace for impact, ready to meet your doom.");
                            System.out.println("A voice booms and he stops suddenly, frozen as a frightened doe.");
                            System.out.println("\nThe boy forgets all about you in the face of his father's annoyance.");
                            runDesk = true;
                            
                        }
                        if(index == 2 && !runMantel){
                            System.out.println("\nQuickly, while you have a moment, you run.");
                            System.out.println("\nThe stone cools your flushed face.");
                            System.out.println("\nA flash catches your eye, the fire place screen.");
                            System.out.println("You slink behind it, the inside of the fireplace is cavernous.");
                            System.out.println("\nThe soot soon covers your body creating, you hope, a sort of camouflage.");
                            System.out.println("\nIt seems that notches have been carved in the wall, just enough of a grip to climb on.");
                            System.out.println("\nA larger hole has been carved at the joint between the floor and the sides.");
                            System.out.println("\nBeing inside it, it reminds you of the niche at the begining of this place.");
                            System.out.println("\nA trap door is above you, with a keyhole.");
                            if(key = true){
                                System.out.println("\nYou fumble for the key in your pocket.");
                                System.out.println("\nIt slides into place.");
                                EscapeCavern();
                            }else{
                                System.out.println("\nIt's locked, and you have no key...");
                                System.out.println("\nYour efforts to open it by force are futile.");
                                System.out.println("\nThis must be the way out of this place.");
                                System.out.println("\nIf only you had that key.");
                            }
                            runMantel = true;
                            //key if statement
                        }
                        
                    }
                    System.out.println("The loop has ended");
                    
                    currentPos = 0;
                    break;

                    case 4:
                    System.out.println("\nAt the end of the hall, a polished door stands ajar.");
                    System.out.println("\n");
                    System.out.println("\nYou dart under the furniture, hearing the scrap of his trousers as he falls to his knees.");
                    System.out.println("\nThe fireplace doors stand ajar, you slip through.");
                    System.out.println("\nThe boy's fingers reach");
                    break;

            }
        }
    }

    public void PlayerDeath(){
        System.out.println("\nThe world fades.");
        System.out.println("\nA strange sense of falling envelops you.");
        System.out.println("\n\n\nYou awaken--groggy--on the stone floor.");
        System.out.println("\nIt seems like you've done this before.");
        lichAlive = true;
        scrolls = false;
        trap1IsComplete = false;
        trap3IsComplete = false;
        currentPos = 0;
        
    }

    public void EscapeCavern(){
        System.out.println("\nThe air clears a little, you can breathe deeper now.");
        System.out.println("\nThe sound of the world above begins to filter through.");
        System.out.println("\nYou reach farther, so close to escaping.");
        System.out.println("\n");
        System.out.println("\n");
    }

    public void LetterRead(){
        System.out.println("\n My Darling,");
        System.out.println("\n\n    I recieved your letter, but regret to say I cannot come home soon. Please do not pester or plead with your father. It does not make his or my time any easier if you do so.");
        System.out.println("\nMy illness is not under his management, no matter how great he may seem to you. Man is only man, and I believe that my fate now lies with Our God.");
        System.out.println("\nPerhaps this place is doing me more good than the last, though I miss you so. The doctors say that the air here is good for me, that miasmas, sickly air fills our home .");
        System.out.println("\n  *this line has been erased, but from your perspective is visible* Sometimes, I do wonder if the miasmas affects you and your father, they say it changes one's demenor. ");
        System.out.println("\n\n\nHave my packages for you arrived? I do not wish to spoil, but I cannot help but be flush with excitement. I sent then just a few weeks ago, so the post must have delievered.");
        System.out.println("\nI thought they were the most charming of little things! The big house truly looks like where I am staying. Oh, when I do return, I hope you will have arranged it so.");
        System.out.println("\nWhen we moved in, I could have sworn the noises weren't mice or cats. For once I found a tiny stocking cap along the baseboards. Oh your father.");
        System.out.println("\nHe thought it jovial at first, but grew disapointed when I continued on with my 'fantasy.' Look for them, my darling, but do not tell him so.");
        System.out.println("\n\nAll my love,\n Mother");
    }


}