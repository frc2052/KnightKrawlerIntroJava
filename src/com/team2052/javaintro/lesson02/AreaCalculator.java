package com.team2052.javaintro.lesson02;

import java.util.Scanner;

public class AreaCalculator {
    private Scanner scanner = null;
    
    public AreaCalculator() {
        scanner = new Scanner(System.in);
    }

    private double circleArea(int radius) {
        return radius * radius * Math.PI;
    }
    
    private int rectangleArea(int height, int width) {
        return height * width;
    }
    public void run() { 
        System.out.println("What would you like to do?");
        System.out.println("1. Find area of a circle.");
        System.out.println("2. Find area of a rectangle");
        int option = scanner.nextInt();
        if (option == 1) {
            circleArea();
        }
        public void circleArea() {
            System.out.println("What radius is the circle?");
            int radius = scanner.nextInt();
            double circleArea = circleArea(radius);
            System.out.println(circleArea);
        }
        

        System.out.println("What height is the rectangle?");
        int height = scanner.nextInt();
        System.out.println("What width is the rectangle?");
        int width = scanner.nextInt();
        int rectangleArea = rectangleArea(height, width);
        System.out.println(rectangleArea);
    }
}
