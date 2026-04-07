package com.csrTraining.accept.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PrimeCheckerUsingScanner {
    public static void main() throws IOException {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entered no. to check if it is prime or not: ");
        int num=sc.nextInt();
        boolean isPrime= isPrime(num);
        if (isPrime)
        {
            System.out.println("Entered number is a prime number. ");
        }
        else
            System.out.println("Entered number is not a prime number. ");

        sc.close();
    }
    private static boolean isPrime(int num)
    {
        if (num<=1)
        {
            return false;
        }
        for (int i =2;i<num;i++)
        {
            if (num%i==0)
            {
                return false;
            }
        }

        return true;
    }
}
