package com.syntaxadda.singletonpattern.serdeserialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Singleton singletonOriginal = Singleton.getInstance();

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.txt"));
            out.writeObject(singletonOriginal);
            out.close();

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.txt"));
            Singleton singletonNew = (Singleton) in.readObject();
            in.close();

            System.out.println("singletonOriginal:: "+singletonOriginal.hashCode());
            System.out.println("singletonNew:: "+singletonNew.hashCode());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
