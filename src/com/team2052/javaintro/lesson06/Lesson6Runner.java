package com.team2052.javaintro.lesson06;
import com.team2052.javaintro.lesson06.Shuffler;


public class Lesson6Runner {

    public void run() {
        Shuffler cardShuffle = new Shuffler();
        Card[] deck = cardShuffle.createDeck();
        printDeck(deck);
    } 
    private void printDeck(Card[] deck) {
        for(int i = 0; i < deck.length; i++) {
            System.out.println(deck[i].getName());
        }
    }
}