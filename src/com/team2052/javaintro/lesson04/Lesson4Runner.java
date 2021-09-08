package com.team2052.javaintro.lesson04;

import java.util.Scanner;

public class Lesson4Runner {
    private Scanner scanner = null;

    public Lesson4Runner() {
        scanner = new Scanner(System.in);
    }

    public void run() {
    
        System.out.println("Please enter your favorite number.");
        int number1 = scanner.nextInt();
        NumberTracker tracker1 = new NumberTracker();
        FavoriteNumberTracker favorite1 = FavoriteNumberTracker.getInstance();
        tracker1.setMyNumber(number1);
        favorite1.setMyNumber(number1);
        
        System.out.println("Please pick a new favorite number");
        int number2 = scanner.nextInt();
        NumberTracker tracker2 = new NumberTracker();
        FavoriteNumberTracker favorite2 = FavoriteNumberTracker.getInstance();
        tracker2.setMyNumber(number2);
        favorite2.setMyNumber(number2);

        if (tracker1.getMyNumber() == favorite1.getMyNumber())
        {
            System.out.println(tracker1.getMyNumber() + " is your favorite number");
        }
        if (tracker2.getMyNumber() == favorite2.getMyNumber())
        {
            System.out.println(tracker2.getMyNumber() + " is your favorite number");
        }

        System.out.println("Tracker1 " + tracker1.getMyNumber());
        System.out.println("Tracker2 " + tracker2.getMyNumber());
        System.out.println("Favorite1 " + favorite1.getMyNumber());
        System.out.println("Favorite2 " + favorite2.getMyNumber());
    }
}
