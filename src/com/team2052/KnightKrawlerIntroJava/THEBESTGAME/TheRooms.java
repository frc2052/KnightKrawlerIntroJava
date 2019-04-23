package com.team2052.KnightKrawlerIntroJava.THEBESTGAME;

public class TheRooms {
    private static TheRooms instance = null;
    public static TheRooms getInstance(){
        instance = new TheRooms();
        return instance;
    }

        public class Rooms {
            public boolean isIntersection = false;
            public boolean getIsIntersection() { return isIntersection; }
            public void setIsIntersection(boolean value) { isIntersection = value; }

            public boolean isItemRoom = false;
            public boolean getIsItemRoom() { return isItemRoom; }
            public void setIsItemRoom(boolean value) { isItemRoom = value; }

            public boolean isMonsterRoom = false;
            public boolean getIsMonsterRoom() { return isMonsterRoom; }
            public void setIsMonsterRoom (boolean value) { isMonsterRoom = value; }
        }

        public RoomBois[] roombois() {
        RoomBois roomz = new RoomBois[];

        }



    public enum roomTypes {

    }

}
