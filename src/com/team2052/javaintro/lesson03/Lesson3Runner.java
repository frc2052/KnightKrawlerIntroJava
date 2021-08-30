package com.team2052.javaintro.lesson03;

import java.util.Scanner;

public class Lesson3Runner {
    private Scanner scanner = null;

    public Lesson3Runner() {
        //this is a constructor. Constructor are called if someone calls "new BasicCalculator()" to create
        //a new instance of the class, also known as creating a BasicCalculator object
        scanner = new Scanner(System.in);
    }

    public void run()
    {
            MultiCalculator calc = new MultiCalculator();
            System.out.println("Please enter method of calculation.");
            System.out.println("1--> ADD");
            System.out.println("2--> SUBTRACT");
            System.out.println("3--> MULTIPLY");
            System.out.println("4--> DIVIDE");
            double option = scanner.nextDouble();
            if (option == 1) {
                calc.setCalcOperation(MultiCalculator.Operation.ADD);
            } else if (option == 2) {
                calc.setCalcOperation(MultiCalculator.Operation.SUBTRACT);
            } else if (option == 3) {
                calc.setCalcOperation(MultiCalculator.Operation.MULTIPLY);
            } else if (option == 4) {
                calc.setCalcOperation(MultiCalculator.Operation.DIVIDE);
            }else {
            System.out.println("Invalid option. Returning to main menu.");
            }

            System.out.println("Please enter the first number.");
            double number1 = scanner.nextDouble();
            calc.setNumber1(number1);
            System.out.println("Please enter the second number");
            double number2 = scanner.nextDouble();
            calc.setNumber2(number2);
            System.out.println("Answer " + calc.calculate());
        }
    }
