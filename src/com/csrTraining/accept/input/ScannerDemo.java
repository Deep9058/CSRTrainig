package com.csrTraining.accept.input;

import java.util.Scanner;

public class ScannerDemo {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name=sc.nextLine();
        System.out.println("Enter Your Age: ");
        int age=sc.nextInt();
        System.out.println("Your Name is :"+name + "and your Age is: "+ age);
        sc.close();
    }
}
