package com.syntaxadda.singletonpattern.reflection;

public class Singleton {

    private static Singleton instance;
    private static boolean isInitialized = false;

    private Singleton(){
        if(isInitialized){
            throw new IllegalStateException("Instance is already created");
        }
        isInitialized = true;
    }

    public static Singleton getInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
}
