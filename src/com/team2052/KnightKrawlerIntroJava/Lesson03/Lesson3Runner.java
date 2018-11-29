package com.team2052.KnightKrawlerIntroJava.Lesson03;

import java.util.Scanner;

public class Lesson3Runner {

    private Scanner scanner = null;

    {

    }

    public void run() {
        System.out.println("What would you like to do?");
        System.out.println("1. add two numbers");
        System.out.println("2. Subtract two numbers");
        System.out.println("3. Keep adding numbers until a non-number is entered");
        int option = scanner.nextInt();
        if (option == 1) {
            multiCalculator();
        } else if (option == 2) {
            subtract();


            System.out.println("Invalid option. Returning to main menu.");
        }


        private void multiCalculator(){
            boolean keepGoing = true;
            while (keepGoing) {
                MultiCalculator calc = new MultiCalculator();
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
       private void subtract

        }

    }
}