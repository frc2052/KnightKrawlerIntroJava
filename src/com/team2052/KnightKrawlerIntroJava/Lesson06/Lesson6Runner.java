package com.team2052.KnightKrawlerIntroJava.Lesson06;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lesson6Runner {
    private Scanner scanner = null;

    public Lesson6Runner(){
        scanner = new Scanner(System.in);
    }


    public  void run(){
            Shuffler shuffle= new Shuffler();
            Card[] deck = shuffle.newDeck();
            Collections.shuffle(Arrays.asList(deck));
            shuffle.shuffleDeck();
            printDeck(deck);


    }
    private void printDeck(Card[] cards){
        for (int i = 0; i<cards.length; i++) {
            System.out.println(cards[i].getName());
        }
    }




}