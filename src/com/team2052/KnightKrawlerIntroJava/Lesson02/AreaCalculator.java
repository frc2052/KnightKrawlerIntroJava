package com.team2052.KnightKrawlerIntroJava.Lesson02;

public class AreaCalculator {

    public static void main(String[] args) {
        AreaCalculator areaThing = new AreaCalculator();
        int rectArea = areaThing.rectangleArea( 4, 5);
        System.out.println( rectArea );
        double cirArea = areaThing.circleArea( 3 );
        System.out.println( cirArea );

    }


    private double circleArea(int radius) {
        return radius * radius * Math.PI;
    }

    private int rectangleArea( int hight , int width) {
        return hight * width;
    }

}
