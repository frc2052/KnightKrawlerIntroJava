package com.team2052.javaintro.lesson05;

public class BattleNumber {
    private static BattleNumber instance = new BattleNumber();
private BattleNumber() {}
public static BattleNumber getInstance() {
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
