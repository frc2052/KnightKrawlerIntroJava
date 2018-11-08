package com.team2052.KnightKrawlerIntroJava.Lesson03;

import com.sun.org.apache.xpath.internal.operations.Operation;

import java.util.Scanner;

public class MultiCalculator {

    public enum Operation {

        ADD,
        SUBTRACT,
        MUILPLY,
        DIVIDE

    }

    private Scanner scanner = null;

    public MultiCalculator() {
        //this is a constructor. Constructor are called if someone calls "new BasicCalculator()" to create
        //a new instance of the class, also known as creating a BasicCalculator object
        scanner = new Scanner(System.in);


    }

    private int number1;
    private int number2;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int val) {
        number1 = val;
    }

    public int getNumber2() {

        return number2;
    }

    public void setNumber02(int val) {

        number2 = val;

    }

    private Operation calcOpA;

    public Operation getcalcOpA() {
        return calcOpA;
    }


    //FIX ASAP PLZ SANA make it connect to Lesson03Runner :///
    public void setcalcOpA(Operation calcAll) {

        calcOpA = calcAll ;

    }

    public int Calculate() {

        if (getcalcOpA() == Operation.ADD)

        {
            return getNumber1() + getNumber2();


        }

        else if (getcalcOpA() == Operation.SUBTRACT){



            return getNumber1() - getNumber2();

        }

        else if (getcalcOpA() == Operation.MUILPLY){

           return getNumber1() * getNumber2();
        }

        else if (getcalcOpA() == Operation.DIVIDE){

            return  getNumber1()/getNumber2();
        }

        else {
            return 0;
        }
    }
}