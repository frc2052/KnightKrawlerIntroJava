package com.team2052.KnightKrawlerIntroJava.Lesson06;

public class Card {

    public static final int ACE = 1;
    public static final int KING = 13;
    public static final int QUEEN = 12;
    public static final int JACK = 11;

    private Suit suit;
    private int number;

    public Card (Suit suit, int number)// the constructor has pramaters so we can pass it two values
    {
        this.suit = suit; // the this means its a class level var
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    public Suit getSuit() {
        return suit;
    }

    public String getName()
    {
        String name = getNumberName() + " of " + suit.name();
        return name;
    }

    private String getNumberName() {
        switch (number)
        {
            case ACE:
                return "Ace";
            case KING:
                return "King";
            case QUEEN:
                return "Queen";
            case JACK:
                return "Jack";
            default:
                return number + ""; //force the integer to a string, this is also here so that we still get "number back" if none of the cases are met
        }
    }

public enum Suit {
    HEARTS,
    DIAMONDS,
    SPADES,
    CLUBS
}
}