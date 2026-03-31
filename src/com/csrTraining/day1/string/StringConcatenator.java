package com.csrTraining.day1.string;

public class StringConcatenator{

    public static void main(String args[])
    {
        String greeting = "Hello world.";
        String name = "Alex.";
        String message = "Welcome to elite Java Club!";
        String personalizedMessage="";
        personalizedMessage= personalizedMessage+greeting+name+message;
        System.out.println(personalizedMessage);
        System.out.println(greeting.length());
        System.out.println(name.length());
        System.out.println(message.length());
        System.out.println(personalizedMessage.length());
        System.out.println(name.charAt(2));
        int index = greeting.indexOf("world");
        System.out.println(index);
        System.out.println(greeting.contains("Hello"));
    }
}