package com.team2052.KnightKrawlerIntroJava.Lesson04;

public class FavoriteNumberTracker {
    private static FavoriteNumberTracker instance = new FavoriteNumberTracker();
    private FavoriteNumberTracker() {}
    public static FavoriteNumberTracker getInstance() {
        return instance;
    }

    private int myNumber;
    public int getMyNumber() {
        return myNumber;
    }
    public void setMyNumber(int val) {
        myNumber = val;
    }
}