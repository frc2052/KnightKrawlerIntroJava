package com.team2052.KnightKrawlerIntroJava;

import com.team2052.KnightKrawlerIntroJava.Lesson01.BasicCalculator;
import com.team2052.KnightKrawlerIntroJava.Lesson02.AreaCalculator;
import com.team2052.KnightKrawlerIntroJava.Lesson03.Lesson3Runner;
import com.team2052.KnightKrawlerIntroJava.Lesson04.Lesson4Runner;
import com.team2052.KnightKrawlerIntroJava.Lesson05.AdventureGame;
import com.team2052.KnightKrawlerIntroJava.Lesson06.Lesson6Runner;
import com.team2052.KnightKrawlerIntroJava.Lesson07.TextRoomsAdventure;

import java.util.Scanner;

public class Main {

    private static Scanner input; //this is a private class level variable, only code in this class can use this

    //the main method is the very first code that is called in a command line application
    //this is where execution starts
    public static void main(String[] args) {
        input = new Scanner(System.in); //create a new Scanner object. This is used to get user input from the command line
        System.out.println("Welcome to KnightKrawler java training");
        showMenu(); //call a method to print the menu on the command line
        boolean keepGoing = true;
        while (keepGoing) {
            String val = input.next(); //get the text the user typed on the command line
            if (val.trim().toLowerCase().equals("exit")) {
                //set keep going to false, which will cause the whileloop to exit,
                // which will end execution of the "main" method, and the application will quit
                keepGoing = false;
            } else if (val.trim().toLowerCase().equals("help")) {
                showMenu();
            } else if (val.trim().equals("1")) {
                BasicCalculator lesson1 = new BasicCalculator(); //create a new BasicCalculator ojbect
                lesson1.run(); //call the "Run" method on the object
            } else if (val.trim().equals("2")) {
                AreaCalculator lesson2 = new AreaCalculator(); //create a new BasicCalculator ojbect
                lesson2.run(); //call the "Run" method on the object
            } else if (val.trim().equals("3")) {
                Lesson3Runner lesson3 = new Lesson3Runner();
                lesson3.run();
            }
            else if (val.trim().equals("4")) {
                Lesson4Runner lesson4 = new Lesson4Runner();
                lesson4.run();
            }else if (val.trim().equals("5")) {
                AdventureGame lesson5 = new AdventureGame();
                lesson5.play();
            }else if (val.trim().equals("6")) {
                Lesson6Runner lesson6 = new Lesson6Runner();
                lesson6.run();
            }else if (val.trim().equals("7")) {
                TextRoomsAdventure lesson7 = new TextRoomsAdventure();
                lesson7.play();
            } else {
                System.out.println("Option not recognized. Enter \"help\" for assistance");
            }
        }//must do work work work work work work work work work work work work work
    }

    //this is a private method, it can only be called from other methods in this class
    private static void showMenu() {
        System.out.println("exit -> Quitter!");
        System.out.println("help -> print the menu");
        System.out.println("1 -> lesson 1, variables and methods");
        System.out.println("2 -> lesson 2, classes");
        System.out.println("3 -> lesson 3, operations");
        System.out.println("4 -> lesson 4");
        System.out.println("5 -> lesson 5");
        System.out.println("6 -> loops");
        System.out.println("7 refactoring");
    }
}
