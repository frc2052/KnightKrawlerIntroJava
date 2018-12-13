package com.team2052.KnightKrawlerIntroJava.Lesson06;

public class Card {
    public static final int ACE = 1;
    public static final int KING = 13;
    public static final int QUEEN = 12;
    public static final int JACK =11;
    //TODO: create constants for Jack, Queen, King

    private Suit suit;
    private int number;

    public Card(Suit suit, int number) {// the constructor has parameters to limit things and requires both the suit and the number to make up the card, defined by the class.
        this.suit = suit;//the "this" statement is the current card in your possession
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Suit getSuit() {
        return suit;
    }

    public String getName() {
        String name = getNumberName() + " of " + suit.name();
        return name;
    }

    private String getNumberName() {
        switch (number) {
            case ACE:
                return "Ace";
            case KING:
                return "King";
            case QUEEN:
                return "Queen";
            case JACK:
                return "Jack";
            //TODO: create case statements for Jack, Queen, King
            default: // if anything doesn't line up with any of the options it will resort to default
                return number + ""; //force the integer to a string
        }
    }

    public enum Suit {
        HEARTS,
        DIAMONDS,
        SPADES,
        CLUBS
    }
}

