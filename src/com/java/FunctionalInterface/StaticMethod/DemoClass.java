package com.java.FunctionalInterface.StaticMethod;

public class DemoClass extends A{
    public static void main(String[] args) {
        MyInterface.display();
        A a = new DemoClass();
        System.out.println(a);
        DemoClass demoClass = new DemoClass();
        demoClass.A();
    }


    public void A(){
        System.out.println("Hello 2");
    }


    @Override
    boolean display() {
        return false;
    }
}

