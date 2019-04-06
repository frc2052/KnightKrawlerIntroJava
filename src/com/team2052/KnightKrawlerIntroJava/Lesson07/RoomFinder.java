package com.team2052.KnightKrawlerIntroJava.Lesson07;

public class RoomFinder {
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
        public Room[] FindRoomerer() {
            Room[] FindRoom = new Room[5];
            FindRoom[0] = new Room();
            FindRoom[1] = new Room();
            FindRoom[2] = new Room();
            FindRoom[3] = new Room();
            FindRoom[4] = new Room();
            return FindRoom;
        }
}
