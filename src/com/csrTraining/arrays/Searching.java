package com.csrTraining.arrays;

import java.util.Arrays;

public class Searching {
    static void main() {
        int[] array1={5,89,8,9,54,63,21,11};
        System.out.println("original array is : "+ Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted Array is : "+Arrays.toString(array1));
        Searching seacrh=new Searching();
        seacrh.searchelement(array1,89);
    }

    public int searchelement(int[] array , int num)
    {
        int index= Arrays.binarySearch(array,num);
        if (index >= 0)
        {
            System.out.println("element matched.");
            System.out.println("at index of "+ index);
        }else
            System.out.println("element not found.");

        return num;
    }
}
