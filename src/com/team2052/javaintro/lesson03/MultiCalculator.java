package com.team2052.javaintro.lesson03;


public class MultiCalculator {
    private int number1;
    private int number2;
    private Operation calcOperation;

    public MultiCalculator() {
        
    }


    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int val){
        number1 = val;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int val){
        number2 = val;
    }

        
    
    public Operation getCalcOperation() {
        return calcOperation;
    }
    public void setCalcOperation(Operation val){
        calcOperation = val;
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
            System.out.println("Error :(");;
        }
    }

    
    public enum Operation {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }
}
