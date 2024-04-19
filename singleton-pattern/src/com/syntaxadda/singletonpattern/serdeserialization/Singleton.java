package com.syntaxadda.singletonpattern.serdeserialization;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable {

    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }

    private Object readResolve() throws ObjectStreamException{
        return getInstance();
    }
}
