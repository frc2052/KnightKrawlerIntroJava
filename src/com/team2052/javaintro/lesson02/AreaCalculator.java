package com.team2052.javaintro.lesson02;

import java.util.Scanner;

public class AreaCalculator {
    private Scanner scanner = null;

    public AreaCalculator() {
        scanner = new Scanner(System.in);
    }
    public void run() {
        System.out.println("Calculate the area of a circle");
        areaOfCircle();
    }

    private double circleArea(int radius) {
        return radius * radius * Math.PI;
    }
    
    //private int rectangleArea(int height, int width) {
        //return height * width;
    //}

    private void areaOfCircle() {
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("Enter radius value");
            int radiusval = scanner.nextInt();
            double areaOfCircleTotal = circleArea(radiusval);
            System.out.println("the area of a circle with that radius is " + areaOfCircleTotal);
            System.out.println("Run Again? (enter \"y\" to continue)");
            scanner.nextLine(); //scanner isn't very smart. this will pickup the last return after "nextInt", clear it
            String prompt = scanner.nextLine();
            keepGoing = prompt.trim().toLowerCase().equals("y");
        }
    }
}
