package com.csrTraining.execptionhandling;
import java.util.Scanner;
public class ThrowsMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String num1, num2;

        System.out.println("Enter first number: ");
        num1 = sc.nextLine();

        System.out.println("Enter Second number: ");
        num2 = sc.nextLine();

        Division div = new Division();

        try {
            div.divide(num1, num2);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numbers only.");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        finally {
            sc.close();
        }
    }
}