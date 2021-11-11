package com.team2052.javaintro.lesson03;

import java.util.Scanner;

public class MultiCalculator {
   private Scanner scanner = null;
    private int number1;
    
    public MultiCalculator() {
        scanner = new Scanner(System.in);
        
    }
    
    public int getNumber1() {
        return number1;
    }
    public void setNumber1(int val){
        if (val < 0) {
            number1 = 0;
        } else {
            number1 = val;
        }
    }
    private int number2;
    public int getNumber2() {
        return number2;
    }
    public void setNumber2(int val){
        if (val < 0) {
            number2 = 0;
        } else { 
            number2 = val;
        }
    }
    public int calculate() {
        return getNumber1() + getNumber2();
    }   
        
}