package com.team2052.javaintro;

import java.util.Scanner;

import com.team2052.javaintro.lesson01.BasicCalculator;
import com.team2052.javaintro.lesson02.AreaCalculator;
import com.team2052.javaintro.lesson03.Lesson3Runner;
import com.team2052.javaintro.lesson04.Lesson4Runner;

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
                BasicCalculator calc = new BasicCalculator(); //create a new BasicCalculator object
                calc.run(); //call the "Run" method on the object
            } else if (val.trim().equals("2")) {
               AreaCalculator calc = new AreaCalculator();
               calc.run(); 
            } else if (val.trim().equals("3")) {
                Lesson3Runner calc = new Lesson3Runner();
                calc.run();
            } else if (val.trim().equals("4")) {
                Lesson4Runner calc = new Lesson4Runner();
                calc.run();
            }
        }
    }

    //this is a private method, it can only be called from other methods in this class
    private static void showMenu() {
        System.out.println("exit -> Quitter!");
        System.out.println("help -> print the menu");
        System.out.println("1 -> lesson 1, variables and methods");
        System.out.println("2 -> lesson 2, classes");
        System.out.println("3 -> lesson 3, getters and setters");
        System.out.println("4 -> lesson 4, singletons");
    }
}
