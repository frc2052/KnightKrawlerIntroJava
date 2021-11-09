package com.team2052.javaintro.lesson03;

import java.util.Scanner;

public class Lesson3Runner {
    //this is a private class level variable. only methods in this class can use this variable
    private Scanner scanner = null;


    public Lesson3Runner() {
        //this is a constructor. Constructor are called if someone calls "new BasicCalculator()" to create
        //a new instance of the class, also known as creating a BasicCalculator object
        scanner = new Scanner(System.in);
    }
    public void run(){

        System.out.println("What would you like to do?");
        System.out.println("1. add two numbers");
        System.out.println("2. Subtract two numbers");
        System.out.println("3. Keep adding numbers until a non-number is entered");
        int option = scanner.nextInt();
        if (option == 1) {
            add();
        } else {
            System.out.println("Invalid option. Returning to main menu.");
        }
    }

    private void add() {
        MultiCalculator calc = new MultiCalculator();
        System.out.println("Please enter the first number.");
        int number1 = scanner.nextInt();
        calc.setNumber1(number1);
        System.out.println("Please enter the second number");
        int number2 = scanner.nextInt();
        calc.setNumber2(number2);
        int sum = calc.calculate();
        System.out.println("The sum of those two numbers is " + 2);
    }
}