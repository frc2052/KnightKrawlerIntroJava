package com.team2052.javaintro.lesson01;

import java.util.Scanner;

public class BasicCalculator {
    //this is a private class level variable. only methods in this class can use this variable
    private Scanner scanner = null;

    public BasicCalculator() {
        //this is a constructor. Constructor are called if someone calls "new BasicCalculator()" to create
        //a new instance of the class, also known as creating a BasicCalculator object
        scanner = new Scanner(System.in);
    }

    //This method is public. It can be called from outside the class
    public void run()
    {
        System.out.println("What would you like to do?");
        System.out.println("1. add two numbers");
        System.out.println("2. Subtract two numbers");
        System.out.println("3. Keep adding numbers until a non-number is entered");
        int option = scanner.nextInt();
        if (option == 1) {
            add();
        } else if (option == 2) {
            subtract();
            //TODO: make a subtract method
        } else if (option == 3) {
            other();
            //TODO: make a continuous add method
            //HINT: you will need to create a class level variable to keep the running total
        } else {
            System.out.println("Invalid option. Returning to main menu.");
        }
    }

    //this method is private, only other methods in this class can call this method
    private void add() {
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("Please enter the first number.");
            int number1 = scanner.nextInt();
            System.out.println("Please enter the second number");
            int number2 = scanner.nextInt();
            int sum = number1 + number2;
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
            int difference = number1 - number2;
            System.out.println("The difference of those two numbers is " + difference);
            System.out.println("Run Again? (enter \"y\" to continue)");
            scanner.nextLine(); //scanner isn't very smart. this will pickup the last return after "nextInt", clear it
            String prompt = scanner.nextLine();
            keepGoing = prompt.trim().toLowerCase().equals("y");
        }
    }
    private void other() {
        boolean keepGoing = true;
        int runningTotal = 0;
        while (keepGoing) {
            System.out.println("Please enter the first number.");
            System.out.println("Please enter number 0 or negative to exit.");
            int number = scanner.nextInt();
            if(number<=0) {
                keepGoing = false; 
            }
            runningTotal+=number;
            System.out.println(runningTotal);
        }
    }
}