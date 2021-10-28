package com.team2052.javaintro.lesson04;

import java.util.Scanner;

public class Lesson4Runner {

    private Scanner scanner = null;

    public void run() {
        scanner = new Scanner(System.in);
        System.out.println("Please enter your favorite number.");
        int number1 = scanner.nextInt();
        NumberTracker tracker1 = new NumberTracker();
        FavoriteNumberTracker favorite1 = FavoriteNumberTracker.getInstance();
        tracker1.setMyNumber2(number1);
        favorite1.setMyNumber(number1);
    
        System.out.println("Please pick a new favorite number");
        int number2 = scanner.nextInt();
        NumberTracker tracker2 = new NumberTracker();
        FavoriteNumberTracker favorite2 = new FavoriteNumberTracker();
        tracker2.setMyNumber2(number2);
        favorite2.setMyNumber(number2);    
        if (tracker1.getMyNumber2() == favorite1.getMyNumber()) { 
            System.out.println(tracker1.getMyNumber2() + " is your favorite number");
        }
            if (tracker2.getMyNumber2() == favorite2.getMyNumber())
        {
            System.out.println(tracker2.getMyNumber2() + " is your new favorite number");
        }
        System.out.println("Tracker1 " + tracker1.getMyNumber2());
        System.out.println("Tracker2 " + tracker2.getMyNumber2());
        System.out.println("Favorite1 " + favorite1.getMyNumber());
        System.out.println("Favorite2 " + favorite2.getMyNumber());
    }
}