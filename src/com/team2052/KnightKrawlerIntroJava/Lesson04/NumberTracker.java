package com.team2052.KnightKrawlerIntroJava.Lesson04;

public class NumberTracker {
    private static NumberTracker instance = new NumberTracker();
    private NumberTracker() {}
    public static NumberTracker getInstance() {
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



