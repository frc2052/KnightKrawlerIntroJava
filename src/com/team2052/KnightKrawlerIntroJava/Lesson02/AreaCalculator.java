package com.team2052.KnightKrawlerIntroJava.Lesson02;

import java.util.Scanner;

public class AreaCalculator {

    private Scanner scanner = null;

    public AreaCalculator() {

        scanner = new Scanner(System.in);
    }

    public void areaCalculator() {
        System.out.println("1. CirculeArea");
        System.out.println("2. RectangleArea");

        int option = scanner.nextInt();

        if (option == 1) {
            CircleArea();

        } else if (option == 2) {
            RectangleArea();
        }


    }

    private void CircleArea() {

        System.out.println("Please enter the radius.");
        int radius = scanner.nextInt();

        System.out.println("the final product is " + circleArea(radius));


    }

    private double circleArea(int radius) {
        return radius * radius * Math.PI;
    }

    private void RectangleArea() {
        boolean keepGoing = true;
        System.out.println("Please enter the first number.");
        int height = scanner.nextInt();
        System.out.println("Please enter the second number");
        int width = scanner.nextInt();
        int product = height * width;
        System.out.println("the product of this is " + product);


    }

}



