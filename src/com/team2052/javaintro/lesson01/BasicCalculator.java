package com.team2052.javaintro.lesson01;

import java.util.Scanner;

public class BasicCalculator {
    //this is a private class level variable. only methods in this class can use this variable
    private Scanner scanner = null;

    private int continuousAddTotal = 0;

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
        } else if (option == 3) {
            continuousAdd();
        } else {
            System.out.println("Invalid option. Returning to main menu.");
        }
    }

    private void continuousAdd() {
        boolean keepGoing = true;
        continuousAddTotal = 0;
        System.out.println("Please enter as many numbers as you would like.\nTo exit enter a number less than or equal to zero.");
        while (keepGoing) {
            System.out.print("input: ");
            int nextValue = scanner.nextInt();
            keepGoing = nextValue > 0;
            if (keepGoing) {
                System.out.print(continuousAddTotal + " + " + nextValue + " = ");
                continuousAddTotal += nextValue;
                System.out.println(continuousAddTotal + "\n");
            }
            // TODO: Catch java.util.InputMismatchException
        }
        System.out.println("Your total comes to " + continuousAddTotal);
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
            int difference = number1 + number2;
            System.out.println("The difference of those two numbers is " + difference);
            System.out.println("Run Again? (enter \"y\" to continue)");
            scanner.nextLine(); //scanner isn't very smart. this will pickup the last return after "nextInt", clear it
            String prompt = scanner.nextLine();
            keepGoing = prompt.trim().toLowerCase().equals("y");
        }
    }
}
