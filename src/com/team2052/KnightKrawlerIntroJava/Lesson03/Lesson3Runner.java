package com.team2052.KnightKrawlerIntroJava.Lesson03;

import java.util.Scanner;

public class Lesson3Runner {
    private MultiCalculator.Operation calcOperation = MultiCalculator.Operation.ADD;
    private Scanner scanner = null;
    public Lesson3Runner(){
        scanner = new Scanner(System.in);
    }
    public void run() {
        System.out.println("What would you like to do?");
        System.out.println("1. add two numbers");
        System.out.println("2. Subtract two numbers");
        int option = scanner.nextInt();
        if (option == 1) {
            add();
        } //else if (option == 2) {
            //subtract();
            //HINT: you will need to create a class level variable to keep the running total
        /*}*/ else {
            System.out.println("Invalid option. Returning to main menu.");
        }
    }
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

}
