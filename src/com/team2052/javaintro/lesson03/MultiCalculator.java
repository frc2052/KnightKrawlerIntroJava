package com.team2052.javaintro.lesson03;


public class MultiCalculator {
    private double number1;
    private double number2;
    private Operation calcOperation;

    public MultiCalculator() {
        
    }


    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double val){
        number1 = val;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double val){
        number2 = val;
    }

        
    
    public Operation getCalcOperation() {
        return calcOperation;
    }
    public void setCalcOperation(Operation val){
        calcOperation = val;
    }

    public double calculate() {
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
        return number1;
    }

    
    public enum Operation {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }
}
