package com.csrTraining.accept.input;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberCheck {
    public static void main() throws IOException {
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader bf= new BufferedReader(isr);
        System.out.println("Entered no. to check if it is prime or not: ");
        String ch = bf.readLine();
        int check=Integer.parseInt(ch);
        boolean isPrime= isPrime(check);
        if (isPrime)
        {
            System.out.println("Entered number is a prime number. ");
        }
        else
            System.out.println("Entered number is not a prime number. ");

        bf.close();
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
