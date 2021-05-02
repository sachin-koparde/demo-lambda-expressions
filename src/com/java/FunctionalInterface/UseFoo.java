package com.java.FunctionalInterface;

import java.util.function.Function;

public class UseFoo {
    public static void main(String[] args) {

        Function<String, String> fn = a -> a+" some text";

        System.out.println(fn.apply("Hello,"));

        Function<Integer, String> fn2 = a -> String.valueOf(a+3);
    }
}