package com.team2052.KnightKrawlerIntroJava.Lesson06;

public class Card {
    public static final int ACE = 1;
    public static final int KING = 13;
    public static final int QUEEN = 12;
    public static final int JACK = 11;

    private Suit suit;
    private int number;

    //sometimes you need to pass a constructor parameters when it is created
    public Card (Suit suit, int number) {
        //"this" is used to define a class level variable when their are multiple variables of the same name
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
        switch (number) {
            case ACE:
                return "Ace";

            case KING:
                return "King";

            case QUEEN:
                return "Queen";

            case JACK:
                return "Jack";

            //if none of the cases are matched then the default runs
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