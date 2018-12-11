package com.team2052.KnightKrawlerIntroJava.Lesson03;

import com.sun.prism.impl.shape.OpenPiscesRasterizer;

import java.util.Scanner;

public class MultiCalculator {
    public enum Operation {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }
    private Operation calcOperation = Operation.ADD;

    private Scanner scanner = null;

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
    };
    public int setNumber2(int val) {
        if (val < 0) {
            number2 = 0;
        } else {
            number2 = val;
        }
        return number2;
    }

    public Operation getCalcOperation(){
        return calcOperation;
    }

    public void setCalcOperation(Operation value){
        calcOperation = value;
    }

    public int calculate() {
        if (getCalcOperation() == Operation.ADD) {
            return this.getNumber1() + this.getNumber2();
        } else if (getCalcOperation() == Operation.SUBTRACT) {
            return this.getNumber1() - this.getNumber2();
        } else if (getCalcOperation() == Operation.MULTIPLY) {
            return this.getNumber1() * this.getNumber2();
        } else if (getCalcOperation() == Operation.DIVIDE) {
            return this.getNumber1() / this.getNumber2();
        }

    }

}




