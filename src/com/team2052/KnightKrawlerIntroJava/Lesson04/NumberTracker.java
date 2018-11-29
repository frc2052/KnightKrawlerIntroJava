package com.team2052.KnightKrawlerIntroJava.Lesson04;

public class NumberTracker {
    public int getMyNumber() {
        return MyNumber();
    }
    public void setmyNumber(int val){
        if (val < 0) {
            MyNumber = 0;
        } else {
            MyNumber = val;
        }
    }
}

