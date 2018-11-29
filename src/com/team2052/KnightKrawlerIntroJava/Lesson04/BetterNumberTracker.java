package com.team2052.KnightKrawlerIntroJava.Lesson04;

public class BetterNumberTracker {
    public int getMyNumber1() {
        return MyNumber();
    }
    public void setMyNumber1(int val){
        if (val < 0) {
            MyNumber = 0;
        } else {
            MyNumber = val;
        }
    }
}
