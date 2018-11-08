package com.team2052.KnightKrawlerIntroJava.lesson02;


import java.util.Scanner;

public class AreaCalculator {
    private Scanner scanner = null;
    public  AreaCalculator() {
        scanner = new Scanner(System.in);
    }
    public void run()
    {
        System.out.println("What would you like to do?");
        System.out.println("1. circleArea");
        System.out.println("2. RetangularArea");
        System.out.println("3. Keep adding numbers until a non-number is entered");
        int option = scanner.nextInt();
        if (option == 1) {
            circleArea();
        } else if (option == 2) {
            rectangleArea();
        } else if (option == 3) {
            //TODO: make a continuous add method
            //HINT: you will need to create a class level variable to keep the running total
        } else {
            System.out.println("Invalid option. Returning to main menu.");

        }
    }
}

    public double circleArea(int radius) {
        return radius * radius * Math.PI;
int number1 = radius



    }

    public int rectangleArea(int height, int width) {
        return height * width;
    }
}
