package com.sdajava.lambda;

public class Main {

    public static int operate (int a, int b,
                                 MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }

    public static void main(String[] args) {
	// write your code here

        MathOperation addition = (int a, int b) -> a+b;
        MathOperation substraction = (a,b) -> a-b;
        MathOperation multiplication = (a,b) -> a*b;
        MathOperation division = (a,b) -> a/b;

        System.out.println(operate(32,87, multiplication));


    }
}
