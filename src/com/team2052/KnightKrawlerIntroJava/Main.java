package com.team2052.KnightKrawlerIntroJava;

import com.team2052.KnightKrawlerIntroJava.Lesson01.BasicCalculator;

import com.team2052.KnightKrawlerIntroJava.Lesson02.AreaCalculator;
import com.team2052.KnightKrawlerIntroJava.Lesson03.Lesson3Runner;
import com.team2052.KnightKrawlerIntroJava.Lesson03.MultiCalculator;
import com.team2052.KnightKrawlerIntroJava.Lesson04.Lesson4Runner;
import com.team2052.KnightKrawlerIntroJava.Lesson05.AdventureGame;
import com.team2052.KnightKrawlerIntroJava.Lesson06.Lesson6runner;
import com.team2052.KnightKrawlerIntroJava.Lesson6_V2.Lesson6_V2Runner;

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
            } else if (val.trim().equals("3")) {
                Lesson3Runner calc = new Lesson3Runner();
                calc.run();
            } else if (val.trim().equals("6")) {
                Lesson6_V2Runner calc = new Lesson6_V2Runner();
                calc.run();
            } else if (val.trim().equals("4")) {
                Lesson4Runner calc = new Lesson4Runner();
                calc.run();
            } else if (val.trim().equals("5")) {
                AdventureGame calc = new AdventureGame();
                calc.play();
            }


            }

        }






    private static void showMenu() {
        System.out.println("exit -> Quitter!");
        System.out.println("help -> print the menu");
        System.out.println("1 -> lesson 1, variables and methods");
        System.out.println("2 -> lesson 2, classes");
        System.out.println("3 -> lesson 3, getters and setters");
        System.out.println("4 -> lesson 4, static keyboard and singleton classes");
        System.out.println("5--> lesson 5, adventure game/case statement");
        System.out.println("6--> lesson 6, Constants, arrays, and 'for' loop");//work in progress

    }
}
