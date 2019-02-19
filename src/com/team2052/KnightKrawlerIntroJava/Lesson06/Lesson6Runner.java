
package com.team2052.KnightKrawlerIntroJava.Lesson06;

import java.util.Arrays;
import java.util.Collections;

public class Lesson6Runner {

    public void run() {
        Shuffler shuffler = new Shuffler();
        Card[] deck = shuffler.createDeck();
        Shuffler.shuffleDeck(deck);
        printDeck(deck);
    }

    public void printDeck (Card[]card) {
        for (int i = 0; i< card.length; i++) {
            Card oneCard = card[i];
            System.out.println(oneCard.getName());
        }
    }
}