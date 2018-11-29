package com.team2052.KnightKrawlerIntroJava.Lesson03;

import java.util.Scanner;

public class Lesson3Runner {


    Scanner scanner = new Scanner(System.in);


    //this method is private, only other methods in this class can call this method
    public void run() {
        boolean keepGoing = true;
        while (keepGoing) {
            MultiCalculator calc = new MultiCalculator();
            System.out.println("Please enter the first number.");
            int number1 = scanner.nextInt();
            calc.setNumber1(number1);
            System.out.println("Please enter the second number");
            int number2 = scanner.nextInt();
            calc.setNumber2(number2);


            System.out.println("What would you like to do?");
            System.out.println("1. Add two numbers");
            System.out.println("2. Subtract two numbers");
            System.out.println("3. Multiply two numbers");
            System.out.println("4. Divide two numbers");

            int option = scanner.nextInt();
            if (option == 1) {
                calc.setCalcOperation(MultiCalculator.Operation.ADD);
            } else if (option == 2) {
                calc.setCalcOperation(MultiCalculator.Operation.SUBTRACT);
            } else if (option == 3) {
                calc.setCalcOperation(MultiCalculator.Operation.MULTIPLY);
            } else if (option == 4) {
                calc.setCalcOperation(MultiCalculator.Operation.DIVIDE);
            }

            int sum = calc.calculate();
            System.out.println("Your Awanser is: " + sum);
            System.out.println("Run Again? (enter \"y\" to continue)");
            scanner.nextLine(); //scanner isn't very smart. this will pickup the last return after "nextInt", clear it
            String prompt = scanner.nextLine();
            keepGoing = prompt.trim().toLowerCase().equals("y");
        }
    }
}