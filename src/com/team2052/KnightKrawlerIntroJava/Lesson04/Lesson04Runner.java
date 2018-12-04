package com.team2052.KnightKrawlerIntroJava.Lesson04;

import java.util.Scanner;

public class Lesson04Runner {


    Scanner scanner = new Scanner(System.in);


    public void run() {
        System.out.println("Please enter your favorite number.");
        int number1 = scanner.nextInt();
        NumberTracker tracker1 = NumberTracker.getInstance();
        BetterNumberTracker better1 = BetterNumberTracker.getInstance();
        tracker1.setMyNumber(number1);
        better1.setMyNumber(number1);
        System.out.println("Please pick a new favorite number");
        int number2 = scanner.nextInt();
        NumberTracker tracker2 = NumberTracker.getInstance();
        BetterNumberTracker better2 = BetterNumberTracker.getInstance();
        tracker2.setMyNumber(number2);
        better2.setMyNumber(number2);

        if (tracker1.getMyNumber() == better1.getMyNumber()) {
            System.out.println(tracker1.getMyNumber() + " is your favorite number");
        }
        if (tracker2.getMyNumber() == better2.getMyNumber()) {
            System.out.println(tracker2.getMyNumber() + " is your favorite number");
        }

        System.out.println("Tracker1 " + tracker1.getMyNumber());
        System.out.println("Tracker2 " + tracker2.getMyNumber());
        System.out.println("Favorite1 " + better1.getMyNumber());
        System.out.println("Favorite2 " + better2.getMyNumber());

    }
    
}




