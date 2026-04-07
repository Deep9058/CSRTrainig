package com.csrTraining.accept.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOddCheck {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf= new BufferedReader(isr);

        System.out.println("please enter the value: ");
        String input = bf.readLine();
        int num=Integer.parseInt(input);
        if (num%2==0)
        {
            System.out.println("Entered no. is Even No.");
        }
        else
            System.out.println("Entered no. is Odd No.");

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
