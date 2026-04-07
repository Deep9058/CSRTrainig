package com.csrTraining.Exercises;

import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Welcome to Arithmetic Operations using Scanner!");
        System.out.print("Please enter the first number: ");

        int num1=sc.nextInt();

        System.out.print("Please enter the second number: ");

        int num2=sc.nextInt();

        System.out.println("Which operation would you like to perform?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1/2/3/4): ");

        int choice=sc.nextInt();
        switch (choice)
        {
            case 1 -> {
                int sum= num1+num2;
                System.out.println(sum);
            }
            case 2 -> {
                int sum= num1-num2;
                System.out.println(sum);
            }
            case 3 -> {
                int sum= num1*num2;
                System.out.println(sum);
            }
            case 4 -> {
                int sum= num1/num2;
                System.out.println(sum);
            }
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        }
        sc.close();
    }
}
