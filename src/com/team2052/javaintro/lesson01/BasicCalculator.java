package com.team2052.javaintro.lesson01;

import java.util.Scanner;

public class BasicCalculator {
    //this is a private class level variable. only methods in this class can use this variable
    private Scanner scanner = null;
    private int total;

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
            nonStopAddition();
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
                int product = number1 - number2;
                System.out.println("when you subtract those you get " + product);
                System.out.println("Run Again? (enter \"y\" to continue)");
                scanner.nextLine(); //scanner isn't very smart. this will pickup the last return after "nextInt", clear it
                String prompt = scanner.nextLine();
                keepGoing = prompt.trim().toLowerCase().equals("y"); 
            }
    }

    private void nonStopAddition() {
        boolean keepGoing = true;
        System.out.println("Enter numbers to be added to one another until you want to stop.");
        System.out.println("To stop and see the total, enter 0 or <0");
        while (keepGoing) {
           int number = scanner.nextInt();
           
           if (number <=0){
            System.out.println("Your total is " + total);
            keepGoing = false;

            System.out.println("Run Again? (enter \"y\" to continue)");
            scanner.nextLine(); //scanner isn't very smart. this will pickup the last return after "nextInt", clear it
            String prompt = scanner.nextLine();
            keepGoing = prompt.trim().toLowerCase().equals("y");
            total = 0;
           }

           else if (number >0){
               int sum = number + total;
               total = sum;
           }

        }
    }
}
