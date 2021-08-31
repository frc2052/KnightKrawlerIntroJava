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
    FavoriteNumberTracker favorite1 = new FavoriteNumberTracker();
    tracker1.setMyNumber(number1);
    favorite1.setMyNumber(number1);
    System.out.println("Please pick a new favorite number");
    int number2 = scanner.nextInt();
    }
}
