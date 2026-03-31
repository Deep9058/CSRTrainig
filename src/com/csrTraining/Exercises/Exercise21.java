package com.csrTraining.Exercises;

public class Exercise21 {

    public static void main (String[] args) {
        // Let's simulate a treasure hunt!
        int startingTreasure = 1000; // Initial treasure
        int clue1 = 500; // Treasure found after solving the first clue
        int clue2 = 750; // Treasure found after solving the second clue
        int clue3 = 2000; // Treasure found after solving the final clue

        int sum = startingTreasure+clue1+clue2+clue3;
        System.out.println(sum);
    }
}
