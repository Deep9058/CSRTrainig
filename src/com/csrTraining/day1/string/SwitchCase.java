package com.csrTraining.day1.string;

public class SwitchCase {


    static void main() {
        String name="Priyanshi";
        switch (name)
        {
            case "Abhishek" -> System.out.println("My name is Abhishek");
            case "Ayush" -> System.out.println("My name is Abhidhek");
            case "Priyanshi" -> System.out.println("My name is Priyanshi");
            case "Deep" -> System.out.println("My name is Deep");
            default -> throw new IllegalStateException("Unexpected value: " + name);
        }
    }
}
