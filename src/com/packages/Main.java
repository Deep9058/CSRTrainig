package com.packages;
enum Singleton {
    INSTANCE;
}

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.INSTANCE;
        Singleton s2 = Singleton.INSTANCE;

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}