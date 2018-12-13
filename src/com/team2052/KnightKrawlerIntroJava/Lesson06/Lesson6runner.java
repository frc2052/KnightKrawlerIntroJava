package com.team2052.KnightKrawlerIntroJava.Lesson06;
import com.team2052.KnightKrawlerIntroJava.Lesson06.Card;
import com.team2052.KnightKrawlerIntroJava.Lesson06.Shuffler;

public class Lesson6runner {

    public void run(){
    Shuffler Sandwich = new Shuffler();
    Card[] deck =  Sandwich.createDeck();
    printDeck(deck);
    }
    private void printDeck(Card[] cake){
        System.out.println("this is your card"+ cake);


    }
}


