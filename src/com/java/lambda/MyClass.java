package com.java.lambda;

import java.util.function.Function;

public class MyClass {

    public static void main(String[] args) {

        Greeting myGreeting = () -> System.out.println("Hello World");

        myGreeting.wish();



    }
}
