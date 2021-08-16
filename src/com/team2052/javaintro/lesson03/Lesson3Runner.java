package com.team2052.javaintro.lesson03;

import java.util.Scanner;

public class Lesson3Runner {
    private Scanner scanner = null;

    public Lesson3Runner() {
        //this is a constructor. Constructor are called if someone calls "new BasicCalculator()" to create
        //a new instance of the class, also known as creating a BasicCalculator object
        scanner = new Scanner(System.in);
    }

    public void run()
    {
        System.out.println("What would you like to do?");
        System.out.println("1. add two numbers");
        int option = scanner.nextInt();
        if (option == 1) {
            input();
        } else if (option == 2) {
            //subtract();
        } else {
            System.out.println("Invalid option. Returning to main menu.");
        }
    }

    private void input() {
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
