package com.java.FunctionalInterface;

public interface B {
    abstract void add();
    default void show(){
        System.out.println("From interface B");
    }
}
