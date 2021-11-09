package com.team2052.javaintro.lesson02;
import java.util.Scanner;
public class AreaCalculator {
   
    private Scanner scanner = new Scanner(System.in);
    

    private double circleArea(int radius) {
        return radius * radius * Math.PI;
   
    }
    private int rectangleArea(int height, int width){


        return height * width;
    }
    private void runCircle(){
        System.out.println("enter radius");
        int radius = scanner.nextInt();
        System.out.println(circleArea(radius));
        
    }
    private void runRectangle(){
        System.out.println("enter height");
        int height = scanner.nextInt();
        System.out.println("enter width");
        int width = scanner.nextInt();
        System.out.println(rectangleArea(height, width));
        if (width == height) {
        System.out.println("This is a square");
        }
    }
    public void run(){
        System.out.println("What would you like to do?");
        System.out.println("1. Rectangle area");
        System.out.println("2. Circle area");
        int option = scanner.nextInt();
        if (option == 1) {
            runRectangle();
        } else if (option == 2) {
            runCircle();
        } else  System.out.println("Invalid option. Returning to main menu.");
}
}