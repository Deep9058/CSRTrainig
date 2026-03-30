package com.packages;

public class Exercise23 {
    public static String checkEven(int inputNum) {

        if(inputNum%2==0)
        {
            System.out.println("EVEN");
        }
        else
            System.out.println("ODD");

        return "";
    }

    static void main() {
        checkEven(14);
    }
}
