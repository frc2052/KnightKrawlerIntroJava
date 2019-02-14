package com.team2052.KnightKrawlerIntroJava.Lesson07;

import com.team2052.KnightKrawlerIntroJava.Lesson06.Card;

public class Room {
    private boolean isExit;

    public boolean getIsExit() { return isExit; }
    public void setIsExit(boolean value) { isExit = value; }

    private boolean isDoorLocked = true;
    public boolean getIsDoorLocked() { return isDoorLocked; }
    public void setIsDoorLocked(boolean value) { isDoorLocked = value; }

    private boolean isMonsterInside;
    public boolean getIsMonsterInside() { return isMonsterInside; }
    public void setIsMonsterInside(boolean value) { isMonsterInside = value; }

    private boolean isKeyInside;
    public boolean getIsKeyInside() { return isKeyInside; }
    public void setIsKeyInside(boolean value) { isKeyInside = value; }

    private String doorDescription;
    public String getDoorDescription() { return doorDescription; }
    public void setDoorDescription(String value) { doorDescription = value; }

    private String youWinStory;
    public String getYouWinStory(){return youWinStory;}
    public void setYouWinStory(String value){youWinStory = value;}

    private String keyStory;
    public String getKeyStory(){return keyStory;}
    public void setKeyStory(String value){keyStory = value;}

    private String monsterStory;
    public String getMonsterStory() { return monsterStory; }
    public void setMonsterStory(String value) { monsterStory = value; }



    public Room[] newRooms(){
        Room[] room = new Room[4];
        room[0] = new Room();
        room[0].setIsExit(true);
        room[0].setIsDoorLocked(true);
        room[0].setDoorDescription("You find a locked door, you need to find a key");
        room[0].setYouWinStory("You made it out of the maze! You go back to your family and live a happy life vowing to never go on another adventure again");
        room[1] = new Room();
        room[1].setIsMonsterInside(true);
        room[1].setMonsterStory("you go into a room and see a cute little creature sitting on a rock, eating something. As you walk forward.  The door slams shut behind you. A swarm of the creatures come out of a hole in the wall and eat you for dinner. Your have died");
        room[2] = new Room();
        room[2].setIsMonsterInside(true);
        room[2].setMonsterStory("You walk outside and breathe a breath of fresh air.  You turn around to see a wolf crouched on a rock. The wolf pounces on you and eats you for dinner. You have died");
        room[3] = new Room();
        room[3].setIsKeyInside(true);
        return room;

    }
}