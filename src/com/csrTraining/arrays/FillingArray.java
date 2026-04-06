package com.csrTraining.arrays;

import java.util.Arrays;

public class FillingArray {
    static void main() {

        //      fill Function       //
        int[] array= new int[10];
        System.out.println(Arrays.toString(array));
        Arrays.fill(array,5);
        System.out.println(Arrays.toString(array));


        //      setAll Function      //
        int[] newarray= new int[5];
        System.out.println(Arrays.toString(newarray));
        Arrays.setAll(newarray, i->(i-1)*2);
        System.out.println(Arrays.toString(newarray));

    }
}
