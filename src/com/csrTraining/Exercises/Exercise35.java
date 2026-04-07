package com.csrTraining.Exercises;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise35 {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf= new BufferedReader(isr);

        System.out.println("Welcome to Arithmetic Operations using BufferedReader!");
        System.out.print("Please enter the first number: ");

        String input1=bf.readLine();
        int num1 = Integer.parseInt(input1);

        System.out.print("Please enter the second number: ");
        String input2=bf.readLine();
        int num2 = Integer.parseInt(input2);

        System.out.println("Which operation would you like to perform?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1/2/3/4): ");

        String input3=bf.readLine();
        int choice = Integer.parseInt(input3);

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
        bf.close();
    }
}

