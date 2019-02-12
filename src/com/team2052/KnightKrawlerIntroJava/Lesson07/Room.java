package com.team2052.KnightKrawlerIntroJava.Lesson07;

public class Room {

    private boolean isExit;
    public boolean getIsExit() { return isExit; }
    public void setIsExit(boolean value) { isExit = value; }

    private boolean isDoorLocked;
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

    private String monsterStory;
    public String getMonsterStory() { return monsterStory; }
    public void setMonsterStory(String value) { monsterStory = value; }

    Room[] rooms() {
        Room[] createRooms = new Room[4];
        createRooms[0] = new Room();
        createRooms[0].setIsExit(true);
        createRooms[0].setIsDoorLocked(true);
        createRooms[1] = new Room();
        createRooms[1].setIsMonsterInside(true);
        createRooms[2] = new Room();
        createRooms[2].setIsKeyInside(true);
        createRooms[3] = new Room();
        createRooms[3].setIsMonsterInside(true);
        return rooms();

    }

}
