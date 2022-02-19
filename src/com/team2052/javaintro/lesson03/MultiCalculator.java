package com.team2052.javaintro.lesson03;

import java.util.Scanner;

public class MultiCalculator {
public Scanner scanner; 
    public void run() {
        System.out.println("Please enter your first number");
        System.out.println("Please enter your second number");
        int option = scanner.nextInt();
        if (option == 1) {
            System.out.println("We have run the method");
    }
}

    int number1;
    private int getNumber1() {
        return number1;
    }
    public void setNumber1(int val){
        number1 = val;
    }

    private int number2;
    public int getNumber2() {
        return number2;
    }
    public void setNumber2(int val){
        number2 = val;
    }

    public int calculate() {
        return getNumber1() + getNumber2();
    }    
}