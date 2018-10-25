package com.team2052.KnightKrawlerIntroJava.Lesson03;

import java.util.Scanner;

public class Lesson3Runner {


    Scanner scanner = new Scanner(System.in);
    private int number1;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int val) {
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

    public void setNumber2(int val) {
        if (val < 0) {
            number2 = 0;
        } else {
            number2 = val;
        }
    }

    public void run() {

        System.out.println("What would you like to do?");
        System.out.println("1. add two numbers");
        System.out.println("2. Subtract two numbers");
        int option = scanner.nextInt();
        if (option == 1) {
            add();
        } else if (option == 2) {
            subtract();
        } else {
            System.out.println("Invalid option. Returning to main menu.");
        }
    }

    //this method is private, only other methods in this class can call this method
    private void add() {
        boolean keepGoing = true;
        while (keepGoing) {
            MultiCalculator calc = new MultiCalculator();
            System.out.println("Please enter the first number.");
            int number1 = scanner.nextInt();
            calc.setNumber1(number1);
            System.out.println("Please enter the second number");
            int number2 = scanner.nextInt();
            calc.setNumber2(number2);
            int sum = calc.calculate();
            System.out.println("The sum of those two numbers is " + sum);
            System.out.println("Run Again? (enter \"y\" to continue)");
            scanner.nextLine(); //scanner isn't very smart. this will pickup the last return after "nextInt", clear it
            String prompt = scanner.nextLine();
            keepGoing = prompt.trim().toLowerCase().equals("y");
        }
    }

    private void subtract() {
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("Please enter the first number.");
            int number1 = scanner.nextInt();
            System.out.println("Please enter the second number");
            int number2 = scanner.nextInt();
            int diff = number1 - number2;
            System.out.println("The difference of those two numbers is " + diff);
            System.out.println("Run Again? (enter \"y\" to continue)");
            scanner.nextLine(); //scanner isn't very smart. this will pickup the last return after "nextInt", clear it
            String prompt = scanner.nextLine();
            keepGoing = prompt.trim().toLowerCase().equals("y");
        }
    }
    public enum Operation {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }
}