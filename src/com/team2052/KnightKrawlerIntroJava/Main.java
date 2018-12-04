package com.team2052.KnightKrawlerIntroJava;

import com.team2052.KnightKrawlerIntroJava.Lesson01.BasicCalculator;

import com.team2052.KnightKrawlerIntroJava.Lesson02.AreaCalculator;
import com.team2052.KnightKrawlerIntroJava.Lesson03.MultiCalculator;

import java.util.Scanner;

public class Main {

    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.println("Welcome to KnightKrawler java training");
        showMenu();
        boolean keepGoing = true;
        while (keepGoing) {
            String val = input.next();
            if (val.trim().toLowerCase().equals("exit")) {

                keepGoing = false;
            } else if (val.trim().toLowerCase().equals("help")) {
                showMenu();
            } else if (val.trim().equals("1")) {
                BasicCalculator calc = new BasicCalculator();
                calc.run();
            } else if (val.trim().equals("2")) {
                AreaCalculator calc = new AreaCalculator();
                calc.areaCalculator();
                System.out.println("Option not recognized. Enter \"help\" for assistance");
            } else if (val.trim().equals("3")){
                MultiCalculator calc = new MultiCalculator();
                System.out.println("Please enter the first number.");
                int number1 = input.nextInt();
                calc.setNumber1(number1);
                System.out.println("Please enter the second number");
                int number2 = input.nextInt();
                calc.setNumber2(number2);
                int sum = calc.calculate();
                System.out.println(sum);






            }
        }
    }


    private static void showMenu() {
        System.out.println("exit -> Quitter!");
        System.out.println("help -> print the menu");
        System.out.println("1 -> lesson 1, variables and methods");
        System.out.println("2 -> lesson 2, classes");
    }
}
