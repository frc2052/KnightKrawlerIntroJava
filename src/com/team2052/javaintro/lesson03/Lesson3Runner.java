package com.team2052.javaintro.lesson03;

import java.util.Scanner;

public class Lesson3Runner {
public Scanner scanner; 
    public void run() {
        MultiCalculator calc = new MultiCalculator();
        System.out.println("Please enter the first number.");
        int number1 = scanner.nextInt();
        calc.setNumber1(number1);
        System.out.println("Please enter the second number");
        int number2 = scanner.nextInt();
        calc.setNumber2(number2);
        int sum = calc.calculate();
    }
}