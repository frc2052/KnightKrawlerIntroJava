package com.team2052.KnightKrawlerIntroJava.Lesson02;

import java.util.Scanner;

public class AreaCalculator {
    private Scanner scanner = null;

    public AreaCalculator() {
        //this is a constructor. Constructor are called if someone calls "new BasicCalculator()" to create
        //a new instance of the class, also known as creating a BasicCalculator object
        scanner = new Scanner(System.in);
    }


    private double circleArea(int radius) {
        return radius * 2 * Math.PI;
    }

    private int rectangleArea(int height, int width){
        return height * width;
    }

    public void run()
    {
        System.out.println("What would you like to do?");
        System.out.println("1. Calculate the area of a circle");
        System.out.println("2. Calculate the area of a rectangle");

        int option = scanner.nextInt();
        if (option == 1) {
            cirArea();
        } else if (option == 2) {
            rectArea();
        } else {
            System.out.println("Invalid option. Returning to main menu.");
        }
    }

    private void cirArea() {
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("Please enter the radius.");
            int rad1 = scanner.nextInt();
            double cirAreaTotal = circleArea(rad1);
            System.out.println("The area of your circle is " + cirAreaTotal);
            System.out.println("Run Again? (enter \"y\" to continue)");
            scanner.nextLine(); //scanner isn't very smart. this will pickup the last return after "nextInt", clear it
            String prompt = scanner.nextLine();
            keepGoing = prompt.trim().toLowerCase().equals("y");
        }
    }

    private void rectArea() {
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("Please enter the height.");
            int hgt = scanner.nextInt();
            System.out.println("Please enter the width.");
            int wid = scanner.nextInt();
            int rectAreaTotal = rectangleArea(hgt, wid);
            System.out.println("The area of your rectangle is " + rectAreaTotal);
            System.out.println("Run Again? (enter \"y\" to continue)");
            scanner.nextLine(); //scanner isn't very smart. this will pickup the last return after "nextInt", clear it
            String prompt = scanner.nextLine();
            keepGoing = prompt.trim().toLowerCase().equals("y");
        }
    }
}
