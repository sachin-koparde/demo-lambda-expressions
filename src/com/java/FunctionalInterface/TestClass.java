package com.java.FunctionalInterface;

public class TestClass extends DemoClass implements A,B{

    public static void main(String[] args) {
        DemoClass demoClass = new TestClass();

        /** The below line executes method from class A
         * since class has highest priority than an interface */
        demoClass.show();

    }

}
