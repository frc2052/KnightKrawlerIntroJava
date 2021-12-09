package com.team2052.javaintro.lesson06;

public class Card {
    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    
    private Suit suit;
    private int number;

    public Card(Suit suit, int number) {
        this.suit = suit;
        this.number = number; //the 'this' keyword outlines that THIS specific suit and number that is chosen will show there
    } // this constructor needs the paramaters of the card in order to return a proper card value 

    public int getNumber() { return number; }
    public Suit getSuit() { return suit;}
    public String getName() {
        String name = getNumberName() + " of " + suit.name();
        return name;
    }

    private String getNumberName() {
        switch (number) {
            case ACE:
                return "Ace";
            case JACK:
                return "Jack";
            case QUEEN:
                return "Queen";
            case KING:
                return "King";
            default:
                return number + ""; //default is basically an else-if function, and if none of the cases match it will return a default number
        }
    }

    public enum Suit {
        HEARTS,
        DIAMONDS,
        SPADES,
        CLUBS
    }
} 
