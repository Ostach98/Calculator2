package com.kodilla.calculator2;

public class Calculator2Application {

    public static void main(String[] args) {


        Calculator calculator = new Calculator();

        int result = calculator.addAToB(23, 12);
        System.out.println(result);

        int result1 = calculator.subtractAFromB(23,12);
        System.out.println(result1);
    }
}
