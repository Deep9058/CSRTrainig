package com.csrTraining.arrays;

import java.util.Arrays;
import java.util.List;


public class CopyArrayusingFunction {
    static void main() {
        int[] oldArray={1,2,8,4,1};
        int[] newArray= new int[oldArray.length+5];
        String[] list= {"Deep", "Ayush", "MJ"};
        String arraystring = Arrays.toString(oldArray);
        List<String> arrr=Arrays.asList(list);
        System.out.println(arrr);
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        System.out.print(arraystring);
        System.out.println();
        for (int arr: newArray)
        {
            System.out.print(arr +"   ");

        }

    }
}
