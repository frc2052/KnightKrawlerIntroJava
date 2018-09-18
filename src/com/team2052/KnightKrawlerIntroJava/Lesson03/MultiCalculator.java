package com.team2052.KnightKrawlerIntroJava.Lesson03;
import java.util.Scanner;
public class MultiCalculator {
    private Scanner scanner = null; private int product;
    public MultiCalculator() {
        //there is comment here, see area calculator for explanation
        scanner = new Scanner(System.in);
    }
    private int number1;
    public int getNumber1() {
        return number1;
    }
    public void setNumber1(int val) {
        number1 = val;
    }
    private int number2;
    public int getNumber2() {
        return number1;
    }
    public void setNumber2(int val) {
        number1 = val;
    }



    public int calculate() {
        return getNumber1() + getNumber2();
    }



}
