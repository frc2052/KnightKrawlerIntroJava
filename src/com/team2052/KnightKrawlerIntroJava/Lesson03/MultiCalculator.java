package com.team2052.KnightKrawlerIntroJava.Lesson03;

import java.util.Scanner;

public class MultiCalculator {
    private int number1;
    private  int number2;
    private Operation calcOperation = Operation.ADD;


        public int getNumber1() {
            return number1;
        }

        public void setNumber1(int val) {
            number1 = val;
        }

        public int getNumber2() {
            return number2;
        }

        public void setNumber2(int val) {
            number2 = val;
        }

        public int calculate() {
            if (getCalcOperation() == Operation.ADD) {
                return this.getNumber1() + this.getNumber2();

            } else if(getCalcOperation() == Operation.SUBTRACT) {
                return this.getNumber1() - this.getNumber2();

            } else if (getCalcOperation() == Operation.MULTIPLY){
                return  this.getNumber1() * this.getNumber2();

            } else if (getCalcOperation() == Operation.DIVIDE){
                return this.getNumber1() / this.getNumber2();

            } else {
            return 0;
            }
        }

        public Operation getCalcOperation() {

            return calcOperation;
        }

        public void setCalcOperation(Operation val){
            calcOperation = val;
        }
        public enum Operation {
            ADD,
            SUBTRACT,
            MULTIPLY,
            DIVIDE
        }
    }



