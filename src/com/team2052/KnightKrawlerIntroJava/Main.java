package com.team2052.KnightKrawlerIntroJava;

import com.team2052.KnightKrawlerIntroJava.Lesson01.BasicCalculator;
import com.team2052.KnightKrawlerIntroJava.Lesson02.AreaCalculator;
import com.team2052.KnightKrawlerIntroJava.Lesson03.Lesson3Runner;
import com.team2052.KnightKrawlerIntroJava.Lesson04.Lesson04Runner;
import com.team2052.KnightKrawlerIntroJava.Lesson05.Adventurethingything;
import com.team2052.KnightKrawlerIntroJava.Lesson06.Lesson06Runner;
import com.team2052.KnightKrawlerIntroJava.Lesson07.TextRoomAdventures;
import com.team2052.KnightKrawlerIntroJava.Lesson07.TextRoomsAdventure;

import java.util.Scanner;

//import com.team2052.KnightKrawlerIntroJava.Lesson02.AreaCalculator;

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
            }  else if (val.trim(). equals("3")){
                Lesson3Runner lesson03 = new Lesson3Runner();
                lesson03.run();
            }  else if (val.trim().equals("4")) {
                Lesson04Runner lesson04 = new Lesson04Runner();
                lesson04.run();
            } else if (val.trim().equals("5")) {
                Adventurethingything lesson05 = new Adventurethingything();
                lesson05.play();
            } else if (val.trim().equals("6")) {
                Lesson06Runner lesson06 = new Lesson06Runner();
                lesson06.run();
            } else if (val.trim().equals("7")){
                TextRoomsAdventure textRoomsAdventure = new TextRoomsAdventure();
                textRoomsAdventure.play();
            }
            else {
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
        System.out.println("3. Run Lesson03");
        System.out.println("4. Run Lesson04");
        System.out.println("5. Run Lesson05");
        System.out.println("6. Run Lesson06");
        System.out.println("7. Run Lesson07");
    }
}


