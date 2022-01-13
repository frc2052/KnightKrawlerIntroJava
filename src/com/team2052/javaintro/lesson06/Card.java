package com.team2052.javaintro.lesson06;

public class Card {
    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    //TODO: create constants for Jack, Queen, King
    
    private Suit suit;
    private int number;

    //The constructor has parameters in order to set the suit and number for an object using this class.
    //The use of the "this" keyword is to refer to the suit it's attatched to being the class level suit rather than thet parameter name.
    public Card (Suit suit, int number)
    {
        this.suit = suit;
        this.number = number;
    }

    public int getNumber() { return number; }
    public Suit getSuit() { return suit;}
    public String getName()
    {
        String name = getNumberName() + " of " + suit.name() + "s";
        return name;
    }

    //The default part of this switch is to give a action if the vaule given to the switch does not satisfy any other case.
    private String getNumberName() {
        switch (number)
        {
            case ACE:
                return "Ace";
            case JACK:
                return "Jack";
            case QUEEN:
                return "Queen";
            case KING:
                return "King";
            default:
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