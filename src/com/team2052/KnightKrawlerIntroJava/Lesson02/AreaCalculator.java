package com.team2052.KnightKrawlerIntroJava.Lesson02;

import java.util.Scanner;


public class AreaCalculator {
    private Scanner scanner = null;

    public AreaCalculator(){
        scanner = new Scanner(System.in);
    }


    private double circleArea(int radius) {
    return radius * 2 * Math.PI;
    }

    private int rectangleArea(int height, int width) {
        return height * width;
    }
    public void run() {
        System.out.println("What would you like to do?");
        System.out.println("1. Find area of circle");
        System.out.println("2. Find area of rectangle");
        int option = scanner.nextInt();
        if (option == 1) {
            areaOfCircle();
        } else if (option == 2) {
            rectangleArea();
        } else {
            System.out.println("Invalid option. Returning to main menu.");
        }
    }

    public void areaOfCircle(){
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("input radius of a circle");
            int radius = scanner.nextInt();
            System.out.println("Area " + circleArea(radius));
            System.out.println("Run Again? (enter \"y\" to continue)");
            scanner.nextLine(); //scanner isn't very smart. this will pickup the last return after "nextInt", clear it
            String prompt = scanner.nextLine();
            keepGoing = prompt.trim().toLowerCase().equals("y");
        }

    }
    public void rectangleArea(){
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("Please enter the first number.");
            int number1 = scanner.nextInt();
            System.out.println("Please enter the second number");
            int number2 = scanner.nextInt();
            int sum = number1 * number2;
            System.out.println("The area of the rectangle is " + sum);
            System.out.println("Run Again? (enter \"y\" to continue)");
            scanner.nextLine(); //scanner isn't very smart. this will pickup the last return after "nextInt", clear it
            String prompt = scanner.nextLine();
            keepGoing = prompt.trim().toLowerCase().equals("y");
        }

    }
}


