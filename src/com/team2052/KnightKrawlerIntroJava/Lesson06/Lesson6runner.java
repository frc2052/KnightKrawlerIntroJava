package com.team2052.KnightKrawlerIntroJava.Lesson06;
import com.team2052.KnightKrawlerIntroJava.Lesson06.Card;
import com.team2052.KnightKrawlerIntroJava.Lesson06.Shuffler;

public class Lesson6runner {

    public void run(){
    Shuffler shuff = new Shuffler();
    Card[] deck =  shuff.createDeck();
    printDeck(deck);
    }
    private void printDeck(Card[] card){
        System.out.println("this is your card"+ card);


    }
}


