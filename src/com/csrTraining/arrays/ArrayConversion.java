package com.csrTraining.arrays;

import java.util.Arrays;
import java.util.List;


public class ArrayConversion {
    static void main() {
        int[] oldArray={1,2,8,4,1};
        String arraystring = Arrays.toString(oldArray);
        System.out.println(arraystring);


        String[] list= {"Deep", "Priyanshi", "MJ"};
        List<String> arrays=Arrays.asList(list);
        System.out.println(arrays);

    }
}
