package com.team2052.KnightKrawlerIntroJava.Lesson03;

import com.sun.org.apache.xpath.internal.operations.Operation;
import com.team2052.KnightKrawlerIntroJava.Main;

import java.util.Scanner;

public class Lesson03Runner {

    private Scanner scanner = null;

    public Lesson03Runner() {
        //this is a constructor. Constructor are called if someone calls "new BasicCalculator()" to create
        //a new instance of the class, also known as creating a BasicCalculator object
        scanner = new Scanner(System.in);

    }

    //This method is public. It can be called from outside the class

    public void calcAll() {
        MultiCalculator calc = new MultiCalculator();
        System.out.println("please add an int");
        int Number01 = scanner.nextInt();
        calc.setNumber1(Number01);


        System.out.println("the second please");
        int Number02 = scanner.nextInt();
        calc.setNumber02(Number02);
        System.out.println("1 = Add");
        System.out.println("2 = Subtract");
        System.out.println("3 = Multiply");
        System.out.println("4 = Divide");
         int enumChoice = scanner.nextInt();
         MultiCalculator.Operation operation;
            // depending on User Input the Enum should equal something different
        switch (enumChoice){

            case 1: operation = MultiCalculator.Operation.ADD;
            break;

            case 2: operation = MultiCalculator.Operation.SUBTRACT;
            break;

            case 3:  operation = MultiCalculator.Operation.MUILPLY;
            break;

            case 4: operation = MultiCalculator.Operation.DIVIDE;
            break;

            default: System.out.println("Please Choose one of those for numbers");



        }

        int answer = enumChoice;


        System.out.println("And the number that is picked iss...... " + answer);

        calcRun();


    }

    public void calcRun()
    {
            calcAll();



    }





    }



