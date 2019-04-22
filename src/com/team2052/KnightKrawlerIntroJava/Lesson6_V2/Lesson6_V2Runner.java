package com.team2052.KnightKrawlerIntroJava.Lesson6_V2;

public class Lesson6_V2Runner {
    Shuffler shuff = new Shuffler();

    public Card[] deck = shuff.createDeck();


    public void run() {
        shuffleDeck();
        printDeck();
    }
    private void printDeck() {
        for(int j = 0; j < deck.length; j++) {
            Card current = deck[j];
            System.out.println(current.getName());
        }
    }
    private void shuffleDeck() {
        shuff.RandomizeArray(deck);
    }





    }