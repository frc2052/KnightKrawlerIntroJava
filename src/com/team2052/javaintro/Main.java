package com.team2052.javaintro;

import com.team2052.javaintro.lesson01.BasicCalculator;
import com.team2052.javaintro.lesson05.AdventureGame;
import com.team2052.javaintro.lesson06.Card;
import com.team2052.javaintro.lesson06.Shuffler;

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
                BasicCalculator calc = new BasicCalculator(); //create a new BasicCalculator ojbect
                calc.run(); //call the "Run" method on the object
            } else if (val.trim().equals("5")) {
                AdventureGame test = new AdventureGame();
                test.play();
            } else if (val.trim().equals("6")) {
                //System.out.println("Test");
                Shuffler cardTest = new Shuffler();
                Card[] cards = cardTest.createDeck();
                Card[] newDeck = cardTest.shuffleDeck(cards);
                for(int i = 0; i < 52; i++) {
                    System.out.println(newDeck[i].getName());
                }
            } else {
                System.out.println("Option not recognized. Enter \"help\" for assistance");
            }
        }
    }

    //this is a private method, it can only be called from other methods in this class
    private static void showMenu() {
        System.out.println("exit -> Quitter!");
        System.out.println("help -> print the menu");
        System.out.println("1 -> lesson 1, variables and methods");
        System.out.println("2 -> lesson 2, classes");
        System.out.println("5 -> lesson 5, state machine using switch");
        System.out.println("6 -> lesson 6, arrays");
    }
}
