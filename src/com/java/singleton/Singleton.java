package com.java.singleton;

//Creating a singleton class Singleton
public class Singleton {

    //static variable of type Singleton which is private
    private static Singleton INSTANCE = null;

    //This is a private constructor of this class
    private Singleton(){

    }

    //static method to create an instance of class
    public static Singleton getInstance() {

        //Lazy initialization
        if (INSTANCE == null)
            INSTANCE = new Singleton();

        return INSTANCE;
    }

}








