package com.csrTraining.arrays;

class JaggedArrays {
    public static void main(String[] args){

        int array[][] = new int[2][];
        int arr[][] = new int[2][];
        array[0] = new int[]{5, 8, 9};
        array[1] = new int[]{3,7};
        for (int i=0;i<array.length;i++)
        {
            for (int j=0; j<array[i].length;j++)
            {
                System.out.print(array[i][j] +"   ");
            }
            System.out.println();
        }

        //  filling values using for loop.  //
        System.out.println();
        System.out.println("Second Jagged Array is : ");
        arr[0] = new int[3];
        arr[1] = new int[2];


        int value = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = value++;
        }
        for (int i = 0; i < arr.length; i++) {
            {
                {
                    for (int j = 0; j < arr[i].length; j++)
                        System.out.print(arr[i][j] + "   ");
                }
                System.out.println();
            }
        }
    }
}