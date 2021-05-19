package com.java.singleton;

public class SingletonImpl {

    public static void main(String[] args) {

//    Cannot create instance of Singleton class
//    Singleton singleton = new Singleton();

        Singleton singleton = Singleton.getInstance();

        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());


    }




}
