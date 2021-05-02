package com.java.FunctionalInterface.DefaultMethod;

public interface A {
    abstract void add();
    default void show(){
        System.out.println("From interface A");
    }
}
