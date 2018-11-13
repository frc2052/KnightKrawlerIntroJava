package com.team2052.KnightKrawlerIntroJava.Lesson01;

import java.util.Scanner;

public class BasicCalculator {

    private Scanner scanner = null;

    public BasicCalculator() {

        scanner = new Scanner(System.in);
    }

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

             sandwich();

        } else {
            System.out.println("Invalid option. Returning to main menu.");
        }


    }


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
            scanner.nextLine();
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

    private void sandwich() {
        int sum = 0 ;
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println();
            System.out.println("Please enter a number.");
            int number = scanner.nextInt();
            //sum = number + sum ;
            /*
            System.out.println("Please enter a number");
            int number = scanner.nextInt();
            */
            if (number <=0) {
                System.out.println("total = " + sum) ;
                keepGoing = false ; }
            else{
                sum = number + sum;
                keepGoing =  true ; }

            // is number1 =< 0 if so display sum and set keepgoing to N
            // if number >0 then Add sum to number1 and sent keepgoing to Y

            /*
            System.out.println("The sum of those two numbers is " + sum);
            System.out.println("Run Again? (enter \"y\" to continue)");
            scanner.nextLine();
            String prompt = scanner.nextLine();
            keepGoing = prompt.trim().toLowerCase().equals("y");
            */
        }
    }

}
