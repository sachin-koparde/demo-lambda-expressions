package com.java.FunctionalInterface;

public interface A {
    abstract void add();
    default void show(){
        System.out.println("From interface A");
    }
}
