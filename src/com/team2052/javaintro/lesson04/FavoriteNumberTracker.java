package com.team2052.javaintro.lesson04;

public class FavoriteNumberTracker {
    private static FavoriteNumberTracker instance = new FavoriteNumberTracker();
    FavoriteNumberTracker() {}
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