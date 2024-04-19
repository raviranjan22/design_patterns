package com.syntaxadda.singletonpattern.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        Class<Singleton> singletonClass = Singleton.class;
        try {
            Constructor<Singleton> constructor = singletonClass.getDeclaredConstructor();
            constructor.setAccessible(true);

            Singleton s1 = constructor.newInstance();
            Singleton s2 = constructor.newInstance();

            System.out.println("s1:: "+s1);
            System.out.println("s2:: "+s2);

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
