package com.team2052.javaintro.lesson03;

import java.util.Scanner;

import com.team2052.javaintro.lesson03.MultiCalculator.Operation;

public class Lesson3Runner {
   
    private Scanner scanner = null;

    public Lesson3Runner() {
        //this is a constructor. Constructor are called if someone calls "new BasicCalculator()" to create
        //a new instance of the class, also known as creating a BasicCalculator object
        scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println("What is the first number?");
        int number1 = scanner.nextInt();
        System.out.println("what is the second number?");
        int number2 = scanner.nextInt();
        System.out.println("What would you like to do?");
        System.out.println("1. Add two numbers");
        System.out.println("2. Subtract two numbers");
        System.out.println("3. Multiply two numbers");
        System.out.println("4. Divide two numbers");
        
        MultiCalculator calc = new MultiCalculator();
        calc.setNumber1(number1);
        calc.setNumber2(number2);
        int option = scanner.nextInt();
        if (option == 1) {
            calc.setOperation(Operation.ADD);
        } else if (option == 2) {
            calc.setOperation(Operation.SUBTRACT);
        } else if (option == 3) {
            calc.setOperation(Operation.MULTIPLY);
        } else if (option == 4) {
            calc.setOperation(Operation.DIVIDE);
        } else {
            System.out.println("Invalid option. Returning to main menu.");
        }
        int answer = calc.calculate();
        System.out.println(answer);
    }
}
