package com.team2052.javaintro.lesson03;

import java.util.Scanner;

public class Lesson3Runner {
    private Scanner scanner = null;
    public Lesson3Runner() {
        scanner = new Scanner(System.in);
    }
    public void run() {
        MultiCalculator calc = new MultiCalculator();
        System.out.println("Please enter the first number.");
        int number1 = scanner.nextInt();
        calc.setNumber1(number1);
        System.out.println("Please enter the second number");
        int number2 = scanner.nextInt();
        calc.setNumber2(number2);
    }    
    public enum Operation {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }
}
