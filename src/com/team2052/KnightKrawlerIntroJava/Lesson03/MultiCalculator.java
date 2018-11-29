package com.team2052.KnightKrawlerIntroJava.Lesson03;

public class MultiCalculator {
    public enum Operation {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }

    private Operation calcOperation = Operation.ADD;

    private int number1;

    public int getNumber1() {
        return number1;
    }
    public void setNumber1(int val){
        if (val < 0) {
            number1 = 0;
        } else {
            number1 = val;
        }
    }


    private int number2;

    public int getNumber2() {
        return number2;
    }
    public void setNumber2(int val){
        if (val < 0) {
            number2 = 0;
        } else {
            number2 = val;
        }
    }


    public Operation getCalcOperation() {
        return calcOperation;
    }
    public void setCalcOperation(Operation op) {
        calcOperation = op;
    }


    public int calculate() {
        if (getCalcOperation() == Operation.ADD) {
            return this.getNumber1() + this.getNumber2();
        } else if(getCalcOperation() == Operation.SUBTRACT) {
            return this.getNumber1() - this.getNumber2();
        } else if(getCalcOperation() == Operation.MULTIPLY) {
            return this.getNumber1() * this.getNumber2();
        } else if(getCalcOperation() == Operation.DIVIDE) {
            return this.getNumber1() / this.getNumber2();
        } else {
            return 0;
        }
    }

}