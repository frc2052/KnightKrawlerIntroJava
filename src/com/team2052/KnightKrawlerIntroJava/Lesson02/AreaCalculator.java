package com.team2052.KnightKrawlerIntroJava.Lesson02;

import java.util.Scanner;

public class AreaCalculator {

    private Scanner scanner = null;

    public AreaCalculator() {

        scanner = new Scanner(System.in);
    }

    public void lightning()
        {
         System.out.println("1. circuleArea");
         System.out.println("2. rectangleArea");

            int option = scanner.nextInt();
            if (option == 1) {
               circuleArea ();
            } else if (option == 2) {
                rectangleArea();


            private double circleArea(int radius) {
            return radius * radius * Math.PI;

        }

            private int rectangleArea(int height, int width) {
            return height * width;


        }

    }
}


