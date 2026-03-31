package com.csrTraining.Exercises;

public class
Exercise26 {

    public static String rankCalculator(int score)
    {
        if (score>=90)
        {
            System.out.println("Grandmaster");
        }
        else if (score>=80) {
            System.out.println("Master");
        }
        else if (score>=70) {
            System.out.println("Expert");
        }
        else if (score>=60) {
        System.out.println("Intermediate");
        }
        else
            System.out.println("Beginner");

        return "";
    }

    static void main() {
        rankCalculator(94);
    }
}