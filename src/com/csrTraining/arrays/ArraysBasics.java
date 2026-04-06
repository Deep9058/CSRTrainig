package com.csrTraining.arrays;
import java.util.Arrays;
public class ArraysBasics {
    static void main() {
        int [] mobilenumber ={2546,4521,5842};
        String[] name= new String[3];
        Person[] person= new Person[5];
        name[0]="Deep";
        name[1]="Ayush";
        name[2]="Ashish";
        System.out.println(Arrays.toString(mobilenumber));
        System.out.println(name.length);
        for (int i =0; i<name.length;i++) {
            System.out.println(name[i]);
        }
    }
}
