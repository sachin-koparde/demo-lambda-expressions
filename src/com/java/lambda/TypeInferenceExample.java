package com.java.lambda;

public class TypeInferenceExample {

    public static void main(String[] args) {
        printLength(str -> str.length());
    }

    public static void printLength(myLambdaExpression lambdaExpression){
        System.out.println(lambdaExpression.sayLength("Hello"));
    }

    @FunctionalInterface
    interface myLambdaExpression{
        int sayLength(String str);
    }
}
