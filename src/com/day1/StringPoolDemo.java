package com.day1;

public class StringPoolDemo {
    public static void main() {

        //using StringPool ( Canonical Representation )/
        String hello="hello";
        String hi= "hello";
        String hey= "hey";
        System.out.println(hello==hi);
        System.out.println(hey==hello);
        System.out.println(hello.hashCode());
        System.out.println(hi.hashCode());
        System.out.println(hey.hashCode());


        //Using Heap memory Allocation//
        String deep = new String("hello");
        String ayush = new String("hello");
        String abhishek = new String("hey");
        System.out.println(deep==ayush);
        System.out.println(deep==abhishek);
        System.out.println(deep.hashCode());
        System.out.println(ayush.hashCode());
        System.out.println(abhishek.hashCode());
        System.out.println(deep.equals(ayush));
    }
}
