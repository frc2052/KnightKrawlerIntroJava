package com.team2052.KnightKrawlerIntroJava.Lesson04;

public class BetterNumberTracker {
    private static BetterNumberTracker instance = new BetterNumberTracker();
    private BetterNumberTracker() {
    }
    public static BetterNumberTracker getInstance() {
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








