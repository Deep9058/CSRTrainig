package com.csrTraining.arrays;

public class ArrayAddition {
    static void main() {
        int[][] array1={{5,7,4},{8,4,6}};
        int[][] array2={ {6,5,2},{5,6,3}};
        int[][] sumArray=new int[2][3];

        for (int i=0;i<array1.length;i++)
        {
            for (int j=0;j<array1[i].length;j++)
            {
                sumArray[i][j]=array1[i][j]+array2[i][j];
                System.out.print(sumArray[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
