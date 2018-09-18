package com.team2052.KnightKrawlerIntroJava.Lesson03;

public class MultiCalculator {
    private int number1;
    private  int number2;

    public int getNumber1() {
        return number1;
    }
    public void setNumber1(int val){
        number1 = val;
    }
    public  int getNumber2(){
        return number2;
    }
    public void setNumber2(int val){
        number2 = val;
    }
    public int calculate() {
        return getNumber1() + getNumber2();
    }
}
