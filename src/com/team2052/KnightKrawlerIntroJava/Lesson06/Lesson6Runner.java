package com.team2052.KnightKrawlerIntroJava.Lesson06;
import java.util.Scanner;

public class Lesson6Runner {
    private Scanner scanner = null;

    public Lesson6Runner(){
        scanner = new Scanner(System.in);
    }


    public  void run(){
            Shuffler shuffle= new Shuffler();
            Card[] deck = shuffle.newDeck();
            System.out.println(deck);


    }
    private void printDeck(){
           System.out.println();
    }

}
