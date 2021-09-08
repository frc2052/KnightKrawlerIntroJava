package com.team2052.javaintro.lesson04;

public class FavoriteNumberTracker {
private static FavoriteNumberTracker instance = new FavoriteNumberTracker();
private FavoriteNumberTracker() {}
public static FavoriteNumberTracker getInstance() {
    return instance;
}

    private int number;
    public int getMyNumber() {
        return number;
    }

    public void setMyNumber(Integer val){
        number = val;
    }

}
