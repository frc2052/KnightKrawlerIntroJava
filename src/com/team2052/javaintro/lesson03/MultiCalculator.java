package com.team2052.javaintro.lesson03;

import com.team2052.javaintro.lesson03.MultiCalculator.Operation;

public class MultiCalculator {
public class Operation {
    
    private static Operation ADD;
    private int number1;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int val) {
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

    public void setNumber2(int val) {
        if (val < 0) {
            number2 = 0;
        } else {
            number2 = val;
        }
    }

    private Operation calcOperation = Operation.ADD;
    public Operation getCalcOperation() {
        return calcOperation;
}

public Operation setCalcOperation(Operation val) {
    if (val < 0) {
        calcOperation = 0;
    } else {
        calcOperation = val;
    }
}

public int calculate() {
    return getNumber1() + getNumber2();
}
public void run() {
}
}

public void setNumber1(int number1) {
}

}