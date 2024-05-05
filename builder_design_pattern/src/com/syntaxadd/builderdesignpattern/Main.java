package com.syntaxadd.builderdesignpattern;

public class Main {
    public static void main(String[] args) {
        Builder  builder = new Builder();
        DatabaseConfig config = builder.build();

        System.out.println(config.toString());
    }
}
