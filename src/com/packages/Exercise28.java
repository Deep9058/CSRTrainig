package com.packages;

public class Exercise28 {
    public static int sumOfFirst100Numbers (int i) {
        int sum = 0;
        int number = 1;
        while(number<i+1)
        {
            sum=sum+number;
            number++;

        }

        System.out.println(sum);
        return sum;
    }

    static void main() {
        sumOfFirst100Numbers(10);
    }
}
