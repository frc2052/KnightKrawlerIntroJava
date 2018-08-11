package com.team2052.KnightKrawlerIntroJava;

import com.team2052.KnightKrawlerIntroJava.Lesson00.BasicCalculator;

import java.util.Scanner;

public class Main {

    private static Scanner input; //this is a private class level variable, only code in this class can use this

    //the main method is the very first code that is called in a command line application
    //this is where execution starts
    public static void main(String[] args) {
        input = new Scanner(System.in); //create a new Scanner object. This is used to get user input from the command line
        System.out.println("Welcome to KnightKrawler java training");
        ShowMenu(); //call a method to print the menu on the command line
        boolean keepGoing = true;
        while (keepGoing) {
            String val = input.next(); //get the text the user typed on the command line
            if (val.trim().toLowerCase().equals("exit")) {
                keepGoing = false;
            } else if (val.trim().toLowerCase().equals("help")) {
                ShowMenu();
            } else if (val.trim().equals("1")) {
                BasicCalculator calc = new BasicCalculator(); //create a new BasicCalculator ojbect
                calc.Run(); //call the "Run" method on the object
            } else {
                System.out.println("Option not recognized. Enter \"help\" for assistance");
            }
        }
    }

    //this is a private method, it can only be called from other methods in this class
    private static void ShowMenu() {
        System.out.println("exit -> Quitter!");
        System.out.println("help -> print the menu");
        System.out.println("1 -> lesson 1, variables and methods");
        System.out.println("2 -> lesson 2, classes");
    }
}
