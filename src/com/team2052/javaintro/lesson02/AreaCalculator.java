package com.team2052.javaintro.lesson02;

import java.util.Scanner;

public class AreaCalculator {
    private Scanner scanner = null;

    public AreaCalculator(){
        scanner= new Scanner(System.in);
        
    }

    private double circleArea(int radius) {
        return radius * radius * Math.PI;
    }
    
    private int rectangleArea(int height, int width) {
        return height * width;
    }
    public void newRun()
    {
        System.out.println("What would you like to do?");
        System.out.println("1. Area of a circle");
        System.out.println("2. Area of a square");
        int option = scanner.nextInt();
        if (option == 1) {
           cirArea();
        } else if (option == 2) {
            recArea();
        } else {
            System.out.println("Invalid option. Returning to main menu.");
        }
    }
    private void cirArea() {
        System.out.println("Please enter the radius number.");
        int radius = scanner.nextInt();
        System.out.println("The area of the circle is " + circleArea(radius) );
        }
    private void recArea() {
        System.out.println("Please enter the height .");
        int height = scanner.nextInt();
        System.out.println("Please enter the width");
            int width = scanner.nextInt();
        System.out.println("The area of the rectangle is " + rectangleArea(height, width) );
        }

}
