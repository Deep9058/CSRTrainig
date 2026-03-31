package com.csrTraining.day1.string;

public class InternDemo {
    public static void main() {

        int x=10;
        int y=6;
        int z=x|y;

        String hello = "hello";
        String obj= new String("hello").intern();
        String obj1= new String("hello");

        System.out.println(hello==obj);
        System.out.println(hello==obj1);
        System.out.println(x&y);
        System.out.println(x|y);
    }
}
