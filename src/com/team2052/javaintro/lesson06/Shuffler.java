package com.team2052.javaintro.lesson06;

public class Shuffler {

    public Card[] createDeck() {
        Card[] deck = new Card[52];
        for (int i = 0; i < 4; i++) { //loop 4 times, once for each suit
            Card.Suit cardSuit = Card.Suit.HEARTS; //i will start at 0
            if (i == 1) {
                cardSuit = Card.Suit.DIAMONDS;
            } else if (i == 2) {
                cardSuit = Card.Suit.SPADES;
            } else if (i == 3) {
                cardSuit = Card.Suit.CLUBS;
            }
            
            for(int j = 0; j < 13; j++) { //loop 13 times, once for each number A 2 3 4 5 6 7 8 9 10 J Q K
                int pos = (i * 13) + j; //hearts go in first 13 spots, hearts go in next 13, etc, etc
                int cardNumber = j+1; //j starts at 0, there is no 0 card, so add 1
                deck[pos] = new Card(cardSuit, cardNumber); 
            }
        }
        return deck;
    }

    public Card[] shuffleDeck(Card[]){
        for(int i = 0; i < deck[pos]; i++) {
            
        }
    }
}
