package com.team2052.KnightKrawlerIntroJava;

import com.team2052.KnightKrawlerIntroJava.Lesson00.BasicCalculator;

import java.util.Scanner;

public class Main {

    private static Scanner input;
    public static void main(String[] args) {

        input = new Scanner(System.in);
        System.out.println("Welcome to KnightKrawler java training");
        ShowMenu();
        boolean keepGoing = true;
        while (keepGoing) {
            String val = input.next();
            if (val.trim().toLowerCase().equals("exit")) {
                keepGoing = false;
            } else if (val.trim().toLowerCase().equals("help")) {
                ShowMenu();
            } else if (val.trim().equals("1")) {
                BasicCalculator calc = new BasicCalculator();
                calc.Run();
            } else {
                System.out.println("Option not recognized. Enter \"help\" for assistance");
            }
        }
    }

    private static void ShowMenu() {
        System.out.println("exit -> Quitter!");
        System.out.println("help -> print the menu");
        System.out.println("1 -> lesson 1, variables and methods");
        System.out.println("2 -> lesson 2, classes");
    }
}
