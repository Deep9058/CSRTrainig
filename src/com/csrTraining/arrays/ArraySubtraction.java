package com.csrTraining.arrays;

public class ArraySubtraction {

    public static int[][] subtractionMatrices() {
        int[][] array1 = { {3,6,2}, {4,9,8} };
        int[][] array2 = { {9,1,7}, {6,4,0} };
        int[][] subArray =new int[2][3];

        for ( int i=0;i<array1.length;i++ ) {
            for (int j = 0; j < array1[i].length; j++)
            {
                subArray[i][j] = array1[i][j] - array2[i][j];
                System.out.print(subArray[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();
        return subArray;
    }

    static void main() {
        subtractionMatrices();
    }
}