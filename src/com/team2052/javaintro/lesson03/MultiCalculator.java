package com.team2052.javaintro.lesson03;

public class MultiCalculator {
    
    private int number1;
    public int getNumber1() {
        return number1;
    }
    public void setNumber1(int val){
        number1 = val;
    }

    private int number2;
    public int getNumber2() {
        return number2;
    }
    public void setNumber2(int val){
        number2 = val;
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
        } else {
            return 0;
        }
    }    

    public enum Operation {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }

    private Operation calcOperation = Operation.ADD;

    public Operation getCalcOperation() {
        return calcOperation;
    }

    public void setOperation(Operation val) {
        calcOperation = val;
    }

}
