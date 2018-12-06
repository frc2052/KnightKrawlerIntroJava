package com.team2052.KnightKrawlerIntroJava.Lesson06;


    public class Card {
        public static final int ACE = 1;
        public static final int JACK = 11;
        public static final int QUEEN = 12;
        public static final int KING = 13;
        //TODO: create constants for Jack, Queen, King

        private Suit suit;
        private int number;

        public Card (Suit suit, int number)
        {
            this.suit = suit;
            this.number = number;
        }

        public int getNumber() { return number; }
        public Suit getSuit() { return suit;}
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
                case JACK:
                    return "JACK";
                //TODO: create case statements for Jack, Queen, King
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
}
