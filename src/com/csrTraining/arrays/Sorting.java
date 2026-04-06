package com.csrTraining.arrays;

import java.util.Arrays;
import java.util.Random;

public class Sorting {
    static void main() {

        //      Simple Sort     //
        int[] smallarray={5,8,4,3,9,1};
        Arrays.sort(smallarray);
        System.out.println(Arrays.toString(smallarray));

//
//        for (int newarr : smallarray)
//        {
//            System.out.print(newarr+"   ");
//        }




    //      ParallelSort        //
        int [] largeArray= new int[10000];
        Random random= new Random();

        for (int i=0;i<largeArray.length;i++)
        {
            largeArray[i]=random.nextInt(1000000);
        }
//        System.out.println(Arrays.toString(largeArray));
        Arrays.parallelSort(largeArray);
        System.out.println(Arrays.toString(largeArray));

    }
}
