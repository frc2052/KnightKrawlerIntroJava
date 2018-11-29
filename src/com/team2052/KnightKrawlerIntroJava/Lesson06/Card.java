package com.team2052.KnightKrawlerIntroJava.Lesson06;

public class Card {
    //things need to be created when the class is created, some things have a number that doesn't change
    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    private Suit suit;
    private int number;

    public Card (Suit suit, int number) {
        //"this" is used when you are calling a class level variable 
        this.suit = suit;
        this.number = number;
    }

    public int getNumber() { return number; }
    public Suit getSuit() { return suit;}
    public String getName() {
        String name = getNumberName() + " of " + suit.name();
        return name;
    }

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
            //runs if the none of the other cases are met like "else"
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