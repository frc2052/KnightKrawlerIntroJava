package com.team2052.KnightKrawlerIntroJava.Lesson04;

public class NumberTracker {

    private int Mynumber;
    public int getMyNumber() {
        return Mynumber;
    }
    public void setMyNumber(int val){
        if (val < 0) {
            Mynumber = 0;
        } else {
            Mynumber = val;
        }
    }

}
