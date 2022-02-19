package com.team2052.javaintro.lesson02;

import java.util.Scanner;

public class AreaCalculator {

private Scanner scanner = new Scanner(System.in);

private double circleArea(int radius) {
    return radius * radius * Math.PI;
}

private int rectangleArea(int height, int width) {
    return height * width;
}
public void RunCircle() {
    System.out.println("Please enter the radius.");
    int radius = scanner.nextInt();
    System.out.println(circleArea(radius));

}
public void RunRectangle() {
    System.out.println("Please enter the width.");
    int width = scanner.nextInt();
    System.out.println("Please enter the height.");
    int height = scanner.nextInt();
    System.out.println(rectangleArea(height, width));
}
public void run() {
    System.out.println("What would you like to do?");
    System.out.println("Type 1 for rectangle area");
    System.out.println("Type 2 for circle area");
    int option = scanner.nextInt();
    if (option == 1) {
    RunRectangle();
    }
    else if (option == 2) {
    RunCircle();
    }
    else System.out.println("Invalid option, return to main menu.");
}

}