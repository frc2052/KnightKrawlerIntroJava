package com.team2052.javaintro.lesson03;
import java.util.Scanner;
public class Lesson3Runner {
    
   private Scanner scanner = new Scanner(System.in);



    public void run() {
        MultiCalculator calc = new MultiCalculator();
        System.out.println("enter first number");
        int number1 = scanner.nextInt();
        System.out.println("enter second number");
        int number2 = scanner.nextInt();
        System.out.println("enter 1 for addition, 2 for subtraction, 3 for multiplication, or 4 for division");
        int val = scanner.nextInt();
        if (val == 1) {
            calc.setCalcOperation(Operation.ADD);
        } else if (val == 2) {
            calc.setCalcOperation(Operation.SUBTRACT);
        } else if (val == 3) {
            calc.setCalcOperation(Operation.MULTIPLY);
        } else if (val == 4) {
            calc.setCalcOperation(Operation.DIVIDE);
        }
        
    }
  
   
    public enum Operation {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }
}