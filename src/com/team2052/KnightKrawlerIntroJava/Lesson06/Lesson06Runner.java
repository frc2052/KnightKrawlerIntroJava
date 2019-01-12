package com.team2052.KnightKrawlerIntroJava.Lesson06;

        import java.util.Scanner;

public class Lesson06Runner {

    Shuffle shulffer = new Shuffle();

    private Scanner scanner = null;

    public Lesson06Runner() {

        scanner = new Scanner(System.in);
    }

    public void run() {
        Card[] cardbois = shulffer.createDeck();
        shulffer.RandomizeArray(cardbois);
        printDeck(cardbois);
    }

    public void printDeck(Card[] card) {
        for (int i = 0; i < card.length; i++ ) {
            Card thiscard = card[i];
            System.out.println(thiscard.getName());
        }
    }


}