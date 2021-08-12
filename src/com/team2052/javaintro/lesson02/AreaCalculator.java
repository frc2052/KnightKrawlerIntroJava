package com.team2052.javaintro.lesson02;

import java.util.Scanner;

public class AreaCalculator {
    private Scanner scanner = null;

    public AreaCalculator() {
        scanner = new Scanner(System.in);
    }
    public void run() {
        System.out.println("What would you like to do?");
        System.out.println("1. calculate the area of a circle");
        System.out.println("2. calculate the area of a rectangle");
        int option = scanner.nextInt();
        if (option == 1) {
            areaOfCircle();
        } else if (option == 2) {
            areaOfrectangle();
        } else {
            System.out.println("please enter either '1' or '2'.");
        }
    }

    private double circleArea(int radius) {
        return radius * radius * Math.PI;
    }
    
    private int rectangleArea(int height, int width) {
        return height * width;
    }

    private void areaOfCircle() {
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("Enter radius value");
            int radiusval = scanner.nextInt();
            double areaOfCircleTotal = circleArea(radiusval);
            System.out.println("the area of a circle with that radius is " + areaOfCircleTotal);
            System.out.println("Run Again? (enter \"y\" to continue)");
            scanner.nextLine();  
            String prompt = scanner.nextLine();
            keepGoing = prompt.trim().toLowerCase().equals("y");
        }
    }
    private void areaOfrectangle() {
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("Enter height value");
            int heightval = scanner.nextInt();
            System.out.println("Enter width value");
            int widthval = scanner.nextInt();
            int areaOfrectangleTotal = rectangleArea(heightval, widthval);
            System.out.println("the area of a rectangle with those values is " + areaOfrectangleTotal);
            System.out.println("Run Again? (enter \"y\" to continue)");
            scanner.nextLine();  
            String prompt = scanner.nextLine();
            keepGoing = prompt.trim().toLowerCase().equals("y");
        }
    }

}
